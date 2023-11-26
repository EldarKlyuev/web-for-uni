// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 задание");
        int a = 5;
        int b = 3;
        int c = 7;
        int d = 2;

        int min = Math.min(a, Math.min(b, Math.min(c, d)));
        int max = Math.max(a, Math.max(b, Math.max(c, d)));
        System.out.println("Наименьшее число: " + min);

        System.out.println("Нажмите Enter для продолжения...");
        scanner.nextLine();
        System.out.println("2-3 задание");

        System.out.println("Наибольшее число: " + max);

        int count = 0;
        if (a == max) {
            count++;
        }
        if (b == max) {
            count++;
        }
        if (c == max) {
            count++;
        }
        if (d == max) {
            count++;
        }
        System.out.println("Кол-во наибольших: " + count);

        System.out.println("Нажмите Enter для продолжения...");
        scanner.nextLine();
        System.out.println("4 задание");

        System.out.print("Введите первое имя:");
        String name1 = scanner.nextLine();

        System.out.print("Введите второе имя:");
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Люди являются тезками.");
        } else {
            System.out.println("Люди НЕ являются тезками.");
        }

        System.out.println("Нажмите Enter для продолжения...");
        scanner.nextLine();
        System.out.println("5 задание");

        System.out.print("Введите месяц: ");
        int month = Integer.parseInt(scanner.nextLine());

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Неверный номер месяца");
        }
    }
}