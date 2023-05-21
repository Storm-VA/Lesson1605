package org.example.homework1605;

import java.util.Random;

public class ElementsAllSum {
    public static void main(String[] args) {


        int[] array = new int[10];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500);
            System.out.print(" " + array[i] + " ");
            sum = sum + array[i];

        }
        System.out.println();
        System.out.println(" Сумма всех рандомных чисел равна: " + sum);
    }
}
class Array2 {
    public static void main(String[] args) {

    int[] array2 = {45, 33, 180, 55};
    int max = array2[0];
    for (int i = 0; i < array2.length; i ++ ) {
        if (array2[i] > max) {
            max = array2[i];
        }
    }
        System.out.println(max);
    }
}
