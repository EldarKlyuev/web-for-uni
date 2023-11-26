// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 задание");

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("Нажмите Enter для продолжения...");
        scanner.nextLine();
        System.out.println("2 задание");

        System.out.print("Введите n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Факториал числа " + n + " равен: " + factorial);

        System.out.println("Нажмите Enter для продолжения...");
        scanner.nextLine();
        System.out.println("3 задание(while)");

        System.out.print("Введите n: ");
        int n2 = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int factorial2 = 1;
        while (i <= n2) {
            factorial2 *= i;
            i++;
        }
        System.out.println("Факториал числа " + n2 + " равен: " + factorial2 );

        int b = 1;
        while (b <= 99) {
            if (b % 2 != 0) {
                System.out.print(b + " ");
            }
            b++;
        }

        System.out.println("Нажмите Enter для продолжения...");
        scanner.nextLine();
        System.out.println("4 задание");

        System.out.print("Введите основание: ");
        double x = Double.parseDouble(scanner.nextLine()); // основание
        System.out.print("Введите степень: ");
        int n3 = Integer.parseInt(scanner.nextLine()); // показатель степени

        double result = Math.pow(x, n3);
        System.out.println(x + " в степени " + n3 + " равно " + result);

        System.out.println("Нажмите Enter для продолжения...");
        scanner.nextLine();
        System.out.println("5 задание");

        int firstTerm = 0;
        int commonDifference = -5;
        int numberOfTerms = 10;

        for (int c = 0; c < numberOfTerms; c++) {
            System.out.print(firstTerm + " ");
            firstTerm += commonDifference;
        }

        System.out.println("Нажмите Enter для продолжения...");
        scanner.nextLine();
        System.out.println("6 задание");


        String str = "Hello, world!";
        char target = 'o';
        int count = 0;

        for (int d = 0; d < str.length(); d++) {
            if (str.charAt(d) == target) {
                count++;
                if (count == 2) {
                    break;
                }
            }
        }

        if (count >= 2) {
            System.out.println("Символ '" + target + "' встречается хотя бы 2 раза.");
        } else {
            System.out.println("Символ '" + target + "' встречается менее 2 раз.");
        }
    }
}