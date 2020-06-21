package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        operationsWithArrays();
        operationsWithMatrix();
        operationsWithDublicates();
    }
    // Task - 1.
    public static void operationsWithArrays() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(75);
            System.out.println(array[i]);
        }
        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] > maxValue) {
                maxValue = array[j];
            }
        }
        System.out.println("min value = " + minValue);
        System.out.println("max value = " + maxValue);

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("За зростанням : " + array[i] + " ");
        }
        Arrays.sort(array);
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println("За спаданням : " + array[j] + " ");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum : " + sum);

        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
            System.out.println(" Заміна елементів : " + array[i]);
        }
    }
    // Task - 2.
    public static void operationsWithMatrix() {
        String[][] matrix = {
                {" To buy ", " To sell ", " To exchange "},
                {"a stock ", "a bond ", "a swap "},
                {"on the stock exchange.", "outside the stock exchange.", "from the issuer."}
        };
        System.out.println(" Значення головної діагоналі :" + matrix[0][0] + matrix[1][1] + matrix[2][2]);
    }
    // Task - 3.
    public static void operationsWithDublicates() {
        int[] mas = {3, 2, 3, 1, 4, 2, 8, 3};
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