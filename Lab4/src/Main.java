import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Массив после сортировки: " + Arrays.toString(array));

        System.out.println("Нажмите Enter для продолжения...");
        scanner.nextLine();
        System.out.println("2 задание");

        String[] carBrands = {"Toyota", "BMW", "Mercedes", "Audi", "Ford", "Honda", "Mclaren", "Subaru", "Tata"};


        Arrays.sort(carBrands);
        System.out.println("Массив после сортировки по возрастанию: " + Arrays.toString(carBrands));

        // Сортировка по убыванию
        Arrays.sort(carBrands, Comparator.reverseOrder());
        System.out.println("Массив после сортировки по убыванию: " + Arrays.toString(carBrands));
    }
}
