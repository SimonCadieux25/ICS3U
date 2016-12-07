/**
 * RollingDice.java
 * 
 * Simon Cadieux
 * Dec 7 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class GuessingGameAdv {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 and 20: ");
		int num = scan.nextInt();
		int guess = 0;
		
		int[] guesses = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for(int i = 1; i<=20; i++){
			System.out.print("Computer guesses: ");
			guess = (int)(Math.random()*19);
			System.out.println(guesses[guess]);
			
			if(guesses[guess]!=num){
				System.out.print("Wrong, Guess Again.");
			}
			else{
				System.out.println("Correct");
				i = 21;
			}
		}
		if(num>20||num<1){
			System.out.println("You cheated: the number entered is not between 1 and 20");
		}
		else if(guesses[guess]!=num){
			System.out.println("You Win the computer could not guess your number");
		}
		else{
			
		}
		
	}

}
