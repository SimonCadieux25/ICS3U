/**
 * QuadraticFormula.java
 * Uses numbers in the quadratic formula
 * Simon Cadieux
 * Sept 30 2016
 */

package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class QuadraticFormula {


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 DecimalFormat df = new DecimalFormat ("0.00");
		
		int a;
		int b;
		int c;
		
		System.out.println("Input numbers for the quadratic formula.");
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		
		System.out.println("+ is= "+(df.format(-1*b+Math.sqrt((b^2)+(4*(a*c)))/2*a))+"\n");
		
		System.out.println("- is= "+(df.format(-1*b-Math.sqrt((b^2)+(4*(a*c)))/2*a)));

	}

}
