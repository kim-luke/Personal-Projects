package com.company;
import java.util.Scanner;

public class collatz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        int maximum = 0;

	    System.out.print("Starting number: ");
		int n = keyboard.nextInt();
		System.out.print(n);

	    while (n != 1) {

	    	if (n > maximum) {
	    		maximum = n;
			}

	        if (n % 2 == 0) {
	            n = n / 2;

            }

	        else {
	            n = (n * 3) + 1;

            }

			System.out.print("    " + n);
			count += 1;

			if (count % 10 == 0) {
				System.out.println("\n");
			}
        }

		System.out.println("\n \nTerminated after " + count + " steps. The largest value was " + maximum + ".");

    }
}
