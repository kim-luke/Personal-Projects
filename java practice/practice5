// This program contains my practice with random number generation

package com.company;
import java.util.Random;
import java.util.Scanner;

public class practice5 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
	    Random r = new Random();

	    int x = 1 + r.nextInt(3);
	    int yourNumber;

	    System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
	    System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
	    System.out.println("He lays down three cards.");

	    System.out.println("\nWhich one is the ace?");

	    System.out.println("\n        ##  ##  ##");
	    System.out.println("        ##  ##  ##\n");

	    yourNumber = keyboard.nextInt();

	    if (yourNumber == x && x == 1) {
	        System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");

	        System.out.println("\n        AA  ##  ##");
            System.out.println("        AA  ##  ##\n");
        }

        else if (yourNumber == x && x == 2) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");

            System.out.println("\n        ##  AA  ##");
            System.out.println("        ##  AA  ##\n");
        }

        else if (yourNumber == x && x == 3) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");

            System.out.println("\n        ##  ##  AA");
            System.out.println("        ##  ##  AA\n");
        }

	    else if (yourNumber != x && x == 1) {
	        System.out.println("Ha! Fast Eddie wins again! The ace was card number " + x + ".");

            System.out.println("\n        AA  ##  ##");
            System.out.println("        AA  ##  ##\n");
        }

        else if (yourNumber != x && x == 2) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + x + ".");

            System.out.println("\n        ##  AA  ##");
            System.out.println("        ##  AA  ##\n");
        }

        else {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + x + ".");

            System.out.println("\n        ##  ##  AA");
            System.out.println("        ##  ##  AA\n");
        }


    }
}
