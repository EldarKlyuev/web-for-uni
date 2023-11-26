// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] oddNumbers = new int[10];

        for (int i = 0, num = 1; i < 10; i++, num += 2) {
            oddNumbers[i] = num;
        }

        for (int i = 0; i < oddNumbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(oddNumbers[i]);
        }

        System.out.println();

        int[] array = {4, 2, 1, 5, 1, 3, 1};

        int min = array[0];
        List<Integer> minElements = new ArrayList<>();
        minElements.add(min);

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minElements.clear();
                minElements.add(min);
            } else if (array[i] == min) {
                minElements.add(min);
            }
        }

        System.out.println("Наименьшие элементы массива:");
        for (int element : minElements) {
            System.out.print(element + " ");
        }

        System.out.println();

        int[] array2 = {4, -5, 0, 6, 8};

        // Находим наибольший и наименьший элементы
        int min2 = array2[0];
        int max = array2[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < min2) {
                min2 = array2[i];
                minIndex = i;
            }
            if (array2[i] > max) {
                max = array2[i];
                maxIndex = i;
            }
        }

        // Меняем местами наибольший и наименьший элементы
        int temp = array2[minIndex];
        array2[minIndex] = array2[maxIndex];
        array2[maxIndex] = temp;

        System.out.println(Arrays.toString(array2));

        System.out.println();

        int[] array3 = new int[10];
        Random random = new Random();

        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(100);

            System.out.print(array3[i]);
            System.out.print(", ");
        }

        int sum = 0;
        for (int num : array3) {
            sum += num;
        }
        double average = (double) sum / array3.length;

        System.out.println("Среднее арифметическое всех элементов массива: " + average);
    }
}