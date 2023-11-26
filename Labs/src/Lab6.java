import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {
        int[] array = {12, 6, 8, 9, 18, 24, 7, 36, 15};
        List<Integer> divisibleByThreeAndSix = new ArrayList<>();

        for (int number : array) {
            if (number % 3 == 0 && number % 6 == 0) {
                divisibleByThreeAndSix.add(number);
            }
        }

        if (divisibleByThreeAndSix.isEmpty()) {
            System.out.println("Ни один элемент в массиве не делится ни на 3, ни на 6.");
        } else {
            System.out.println("Числа, делящиеся как на 3, так и на 6 в массиве: " + divisibleByThreeAndSix);
        }


        //////////////////////////////////////////////////////////////////////////
        int[] array2 = {5, 10, 15, 20, 25};

        double sum = 0;
        for (int number : array2) {
            sum += number;
        }

        double average = sum / array2.length;
        System.out.println("Среднее арифметическое:  " + average);


        //////////////////////////////////////////

        double cathetus1 = 3.0;
        double cathetus2 = 4.0;

        double hypotenuse = Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2);
        double perimeter = cathetus1 + cathetus2 + hypotenuse;
        double area = (cathetus1 * cathetus2) / 2;

        System.out.println("Гепотенуза: " + hypotenuse);
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площадь: " + area);


        //////////////////////////////////////////////


        int number1 = 24;
        int number2 = 36;

        int nod = findNOD(number1, number2);
        int NOK = (number1 * number2) / nod;

        System.out.println("NOD " + number1 + " and " + number2 + " " + nod);
        System.out.println("NOK " + number1 + " and " + number2 + " " + NOK);

        /////////////////////////

        double radius = 5.0; // Радиус вращения
        double height = 10.0; // Высота конуса

        double volume = (Math.PI * radius * radius * height) / 3.0;

        System.out.println("Объем конуса: " + volume);

    }

    public static int findNOD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


