package org.example.homework1605;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a length array -- " );
        int sizeArray = scanner.nextInt();


        int[] array11 = new int[sizeArray];
        for (int i = 0; i < array11.length; i++) {
            array11[i] = random.nextInt(55);
            int num = array11[i];
            System.out.println(" " + num);
        }
        System.out.println(" Sorted array -- ");
        Arrays.sort(array11);
        for (int i = array11.length - 1; i>=0; i --) {
            System.out.print(" " + array11[i] + " ");
        }
    }
}