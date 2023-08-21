package ru.ifellow.qa_auto.Array_of_random_numbers;

import java.util.Arrays;

public class Random_Number_Array {
    public static void main(String[] args) {
        int size = 10;
        double[] array = new double[size];


        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }


        System.out.println("Array: " + Arrays.toString(array));


        double min = array[0];
        double max = array[0];
        double sum = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
        }

        double average = sum / size;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}

