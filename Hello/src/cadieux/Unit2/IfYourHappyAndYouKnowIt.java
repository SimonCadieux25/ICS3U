/**
 * IfYourHappyAndYouKnowIt.java
 * Prints out 10 verses of a song
 * Simon Cadieux
 * Dec 5 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class IfYourHappyAndYouKnowIt {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] verse = {" Clap Your Hands"," Stomp Your Feet", " Bob Your Head", " Shake Your Legs", " Dab", " Turn Aroud", " Snap Your Fingers", " Spin", " Wave Your Arms", " Start a program"};
		
		for(int i = 0; i<10; i++){
			
			for(int c = 1; c<=4;c++){
				if(c==3){
					System.out.println("If Your Happy And You Know It And You Really want to show it");
					
				}
				else{
					System.out.println("If Your Happy And You Know It" + verse[i]);
				}
			}
			System.out.println("\n");
		}
		
	}

}
