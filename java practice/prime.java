package com.company;

public class Main {

    public static void main( String[] args ) {
        int count = 0;
        int i = 2;

        //for (int i = 2; i < 10000; i++) {
        while (count < 100000) {

            if (isPrime(i) == true) {
                count = count + 1;
                System.out.println(count + "th " + "Prime number: " + i);
            }

            i = i + 1;
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
