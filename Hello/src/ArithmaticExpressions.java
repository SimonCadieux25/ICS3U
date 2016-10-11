/**
 * ArithmaticExpressions.java
 * Prints out numbers and different combinations of numbers
 * Simon Cadieux
 * Sept 26 2016
 */

import java.util.Scanner;

public class ArithmaticExpressions {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		num5 = scan.nextInt();
		
		System.out.println("The sum of all 5 numbers: "+ (num1+num2+num3+num4+num5));
		System.out.println("Second number - Third number: "+ (num2-num3));
		System.out.println("First number X the fifth number: "+ (num1*num5));
		System.out.println("quotient of the fourth number divided by the second: "+ (num4/num2));
		System.out.println("remainder when dividing the fourth number by the second: "+ (num4%num2)); 	
		System.out.println("first number raised to the power of the third number: "+ (num1^num3));
		System.out.println("square root of the fifth number: "+ Math.sqrt(num5));
		
	}

}
