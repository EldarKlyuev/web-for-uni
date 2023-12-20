from django.urls import path
from .views import *

urlpatterns = [
    path('register/', RegisterView.as_view(), name='register'),
    path('question/', QuestionGetAPIView.as_view()),
    path('question/<int:pk>/', QuestionDeleteAPIView.as_view()),
    path('logout/', DeleteTokenAPIView.as_view(), name='logout-user'),
]