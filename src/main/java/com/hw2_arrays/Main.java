package main.java.com.hw2_arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];

        printRandomArray(array);
        prinMinValueArray(array);
        prinMaxValueArray(array);
        sortArrayFromMinToMax(array);
        sortArrayFromMaxToMin(array);
        printSunOfArray(array);
        printValueSqured(array);

        String[][] matrix = {
                {"To buy", "To sell", "To exchange"},
                {"a stock", "a bond", "a swap"},
                {"on the stock exchange.", "outside the stock exchange.", "from the issuer."}
        };
        printDiagonal(matrix);

        int[] mas = {3, 2, 3, 1, 4, 2, 8, 3};
        printChangeDublicates(mas);
    }

    // Task - 1.
    public static void printRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(75);
            System.out.println(array[i]);
        }
    }

    public static void prinMinValueArray(int[] array) {
        int minValue = array[0];
        for (int i : array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println("min value = " + minValue);
    }

    public static void prinMaxValueArray(int[] array) {
        int maxValue = array[0];
        for (int j : array) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        System.out.println("max value = " + maxValue);
    }

    public static void sortArrayFromMinToMax(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("За зростанням : " + array[i] + " ");
        }
    }

    public static void sortArrayFromMaxToMin(int[] array) {
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println("За спаданням : " + array[j] + " ");
        }
    }

    public static void printSunOfArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Sum : " + sum);
    }

    public static void printValueSqured(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
            System.out.println(" Заміна елементів : " + array[i]);
        }
    }

    // Task - 2.
    public static void printDiagonal(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    // Task - 3.
    public static void printChangeDublicates(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    mas[j] = 0;
                }
            }
        }
        System.out.println("No Dublicates : " + Arrays.toString(mas));
    }
}
