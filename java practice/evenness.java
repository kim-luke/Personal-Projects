package com.company;

public class Main {

    public static void main( String[] args ) {
        for (int i = 1; i < 21; i++) {
            if (isEven(i) == true && divisibleBy3(i) == true) {
                System.out.println(i + " <=");
            }

            else if (isEven(i) == true) {
                System.out.println(i + " <");
            }

            else if (divisibleBy3(i) == true) {
                System.out.println(i + " =");
            }

            else {
                System.out.println(i);
            }
        }
    }

    public static boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public static boolean divisibleBy3(int n) {
        if (n % 3 == 0) {
            return true;
        }

        else {
            return false;
        }
    }
}
