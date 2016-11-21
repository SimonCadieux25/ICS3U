/**
 * ChaosTheory.java
 * Chaos theory using a number given by the user
 * Simon Cadieux
 * Nov 21 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class ChaosTheory {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter a number between 0 and 1: ");
		double x = scan.nextDouble();
		
		for (int i = 1; i<= 50; i++){
			x = 2*x*(1 - x);
			System.out.println(x);
		}
		System.out.print("enter a number between 2 and 4: ");
		double y = scan.nextDouble();
		double X = 0.5;
		for (int i = 1; i<= 50; i++){
			X = y*X*(1 - X);
			System.out.println(X);
		}

	}
}
