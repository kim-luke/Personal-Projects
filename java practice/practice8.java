// This program contains my practice with arrays and random numbers
package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();

        int array[] = new int[10];
        int newArray[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int x = 1 + r.nextInt(99);
            array[i] = x;
        }

        for (int i = 0; i < 10; i++) {
            newArray[i] = array[i];
        }

        array[9] = -7;

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
