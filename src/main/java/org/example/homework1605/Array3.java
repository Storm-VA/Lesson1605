package org.example.homework1605;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size array --- " );
        int size = scanner.nextInt();
        int[] array3 = new int [size];

        System.out.println(" New numbers in array3 is --- ");

        Random random = new Random();
        // int[] array3 = new int[size];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(111);
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        int min = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min) {
                min = array3[i];
            }
        }

        System.out.println("Minimal numbers in arrays is:  " + min);
    }
}
