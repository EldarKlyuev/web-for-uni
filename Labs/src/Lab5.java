import java.util.Arrays;
import java.util.Random;

public class Lab5 {
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        Random random = new Random();

        // Заполнение массива случайными числами от 0 до 99
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        // Вывод третьей строки
        System.out.println("Третья строка массива:");
        for (int j = 0; j < 6; j++) {
            System.out.print(array[2][j] + " ");
        }


        ////////////////////////////////

        int[][] matrixC = new int[3][3];
        int[][] matrixD = new int[3][3];
        Random random2 = new Random();

        // Заполнение матриц случайными числами от 0 до 99
        System.out.println("\nМатрица C:");
        fillMatrix(matrixC, random2);
        printMatrix(matrixC);

        System.out.println("\nМатрица D:");
        fillMatrix(matrixD, random2);
        printMatrix(matrixD);

        // Сложение матриц
        System.out.println("\nСложение матриц C и D:");
        int[][] sumMatrix = addMatrices(matrixC, matrixD);
        printMatrix(sumMatrix);

        // Умножение матриц
        System.out.println("\nУмножение матриц C и D:");
        int[][] productMatrix = multiplyMatrices(matrixC, matrixD);
        printMatrix(productMatrix);

        //////////////////////////////////////////////

        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int[] row : array2) {
            for (int element : row) {
                sum += element;
            }
        }

        System.out.println("Сумма всех элементов в двумерном массиве: " + sum);


        ///////////////////////////////////////

        int[][] array3 = {
                {1, -2, 3, -4},
                {-5, 6, -7, 8},
                {9, -10, 11, -12}
        };

        System.out.println("Индексы ячеек с отрицательными числами:");
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                if (array3[i][j] < 0) {
                    System.out.println("[" + i + "][" + j + "]");
                }
            }
        }


        //////////////////////////////


        int[][] array4 = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };

        System.out.println("Исходный массив:");
        printArray(array4);

        sortRows(array4);

        System.out.println("\nМассив после сортировки строк:");
        printArray(array4);
    }

    public static void fillMatrix(int[][] matrix, Random random) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    // Вывод матрицы на консоль
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Сложение матриц
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Умножение матриц
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void sortRows(int[][] array) {
        for (int[] ints : array) {
            Arrays.sort(ints);
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
