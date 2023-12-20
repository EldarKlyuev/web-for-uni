from rest_framework import status
from rest_framework import generics
from rest_framework.response import Response
from rest_framework.views import APIView
from rest_framework.authtoken.models import Token
from django.contrib.auth.models import User
from .models import *
from .serializers import *

class RegisterView(APIView):
    '''Вью регистрации пользователя'''

    def post(self, request, *args, **kwargs):
        serializer = UserSerializer(data=request.data)
        if serializer.is_valid():
            user = serializer.save()
            user_instance = User.objects.get(username=serializer.validated_data['username'])
            token, created = Token.objects.get_or_create(user=user_instance)
            return Response({'token': token.key}, status=status.HTTP_201_CREATED)
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)


class QuestionGetAPIView(APIView):
    '''Получение вопросов'''

    def get(self, request):
        question = Question.objects.all()
        choise = Choice.objects.all()
        serializer_question = QuestionSerializer(question, many=True)
        serializer_choice = ChoiceSerializer(choise, many=True)
        return Response({"question": serializer_question.data,
                         "choise": serializer_choice.data}, status=status.HTTP_200_OK)


class DeleteTokenAPIView(APIView):
    '''Выход пользователя из системы'''

    def delete(self, request):
        try:
            token = Token.objects.get(key=request.data.get('token'))
            token.delete()
        except Exception as ex:
            print(ex)

        return Response(status=status.HTTP_204_NO_CONTENT)


class QuestionDeleteAPIView(APIView):
    '''Удаление вопросов'''

    def delete(self, request, **kwargs):
        pk = kwargs.get("pk", None)
        if not pk:
            return Response({"error": "Method DELETE not allowed"}, status=405)
        que = Question.objects.get(pk=pk)
        que.delete()
        return Response(status=status.HTTP_204_NO_CONTENT)