/**
 * GuessingGame.java
 * Generates a random number and gets the user to guess what the number is
 * Simon Cadieux
 * Nov 10 2016
 */
package cadieux.Unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GuessingGame {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int sX = (int)(Math.random()*20)+1;
		int X;
		int counter = 1;
		while (counter <= 1){
		System.out.print("Guess a number between 1 and 20: ");
		X = scan.nextInt();
		
		if (X == sX){
			System.out.println("YOU WON!");
			counter = counter + 1;
		}
		else{
			System.out.println("Try again.");
		}
		}

	}

}
