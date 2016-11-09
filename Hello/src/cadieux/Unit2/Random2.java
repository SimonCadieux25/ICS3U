/**
 * Random1.java
 * uses a random number as a die roll and tells weather the user or the computer got a higher number
 * Simon Cadieux
 * Nov 9 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int uDie1;
		int uDie2;
		int cDie1;
		int cDie2;
		
		uDie1 = (int)(Math.random()*6)+1;
		uDie2 = (int)(Math.random()*6)+1;
		
		System.out.println("You Rolled a: " + uDie1);
		System.out.println("       and a: " + uDie2);
		System.out.println("Your total roll is: " + (uDie1+uDie2) + "\n");
		
		cDie1 = (int)(Math.random()*6)+1;
		cDie2 = (int)(Math.random()*6)+1;
		
		System.out.println("Computer Rolled a: " + cDie1);
		System.out.println("            and a: " + cDie2);
		System.out.println("the Computers total roll is: " + (cDie1+cDie2) + "\n");
		
		int cTotal = cDie1 + cDie2;
		int uTotal = uDie1 + uDie2;
		
		if (cTotal > uTotal){
			System.out.println("The computer wins with a higher roll of " + cTotal);
		}
		else if (uTotal > cTotal){
			System.out.println("You win with the higher roll of " + uTotal);
		}
		else{
			System.out.println("It's a tie with the rolls of " + uTotal + " for you and " + cTotal + " for the Computer");
		}
		

	}

}
