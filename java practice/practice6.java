// This program contains my practice with while loops

package com.company;
import java.util.Scanner;
import java.util.Random;

public class practice6 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int dice1 = 1 + r.nextInt(6);
        int dice2 = 1 + r.nextInt(6);
        int total = dice1 + dice2;

        System.out.println("HERE COMES THE DICE!\n");

        while (dice1 != dice2) {
            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.println("The total is " + total);
            dice1 = 1 + r.nextInt(6);
            dice2 = 1 + r.nextInt(6);
            total = dice1 + dice2;
        }

        System.out.println("Both dice1 and dice2 are the same!");
        System.out.println("dice1's value: " + dice1);
        System.out.println("dice2's value: " + dice2);
    }
}
