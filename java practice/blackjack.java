package com.company;
import java.util.Random;
import java.util.Scanner;

public class blackjack {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
	    Random r = new Random();

	    int playerCard1 = 2 + r.nextInt(10);
	    int playerCard2 = 2 + r.nextInt(10);
	    int playerTotal = playerCard1 + playerCard2;
		String playerChoice;

	    int dealerCard1 = 2 + r.nextInt(10);
	    int dealerCard2 = 2 + r.nextInt(10);
	    int dealerTotal = dealerCard1 + dealerCard2;

	    System.out.println("This is Luke's blackjack program!");
	    System.out.println("Your two cards are " + playerCard1 + " and " + playerCard2);
	    System.out.println("Your total is " + playerTotal + ".");

	    System.out.println("The dealer has a " + dealerCard1 + " showing, and a hidden card as well.");
	    System.out.println("His total is also hidden.");

	    System.out.println("Would you like to 'hit or 'stay'?");
	    playerChoice = keyboard.next();

	    if (playerChoice == "hit") {

			while (playerChoice == "hit") {
				int playerCard3 = 2 + r.nextInt(10);
				playerTotal = playerTotal + playerCard3;
				System.out.println("You drew a " + playerCard3 + ".");
				System.out.println("Your new total is " + playerTotal + ".");

				if (playerTotal > 21) {
					System.out.println("Game over! Your total is greater than 21.");
				} else {
					System.out.println("Would you like to 'hit' or 'stay'?");
					playerChoice = keyboard.next();
				}
			}
		}

	    if (playerChoice == "stay") {
	    	System.out.println("Dealer's turn.");
	    	System.out.println("The dealer's hidden card was a " + dealerCard2 + ".");
	    	System.out.println("The dealer's total is " + dealerTotal + ".");

	    	if (dealerTotal > 16) {
	    		System.out.println("The dealer chooses to stay.");
	    		System.out.println("The dealer's total is " + dealerTotal + ".");

	    		if (dealerTotal > 21) {
	    			System.out.println("The dealer's total is over 21.");
	    			System.out.println("You win!");
				}

	    		if (playerTotal > dealerTotal && playerTotal <= 21 && dealerTotal <= 21) {
					System.out.println("Your total was " + playerTotal + ".");
					System.out.println("You win!");
				}

	    		else if (playerTotal < dealerTotal && playerTotal <= 21 && dealerTotal <= 21) {
					System.out.println("Your total was " + playerTotal + ".");
					System.out.println("You lose!");
				}

			}

	    	else if (dealerTotal <= 16) {

	    		while (dealerTotal <= 16) {
					System.out.println("The dealer chooses to hit.");
					int dealerCard3 = 2 + r.nextInt(10);
					dealerTotal = dealerTotal + dealerCard3;

					System.out.println("The dealer draws a " + dealerCard3 + ".");
					System.out.println("The dealer's new total is " + dealerTotal + ".");

					if (dealerTotal > 21) {
						System.out.println("The dealer's total is " + dealerTotal + ".");
						System.out.println("You win!");
					}
				}

				if (dealerTotal > 21) {
					System.out.println("The dealer's total is over 21.");
					System.out.println("You win!");
				}

				if (playerTotal > dealerTotal && playerTotal <= 21 && dealerTotal <= 21) {
					System.out.println("Your total was " + playerTotal + ".");
					System.out.println("You win!");
				}

				else if (playerTotal < dealerTotal && playerTotal <= 21 && dealerTotal <= 21) {
					System.out.println("Your total was " + playerTotal + ".");
					System.out.println("You lose!");
				}

			}
		}

    }
}
