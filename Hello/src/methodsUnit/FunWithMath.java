/**
 * FunWithMath.java
 * gets two numbers from the user and then adds, subtracts, multiplies and divides them
 * Simon Cadieux
 * Jan 13 2017
 */
package methodsUnit;

import java.util.Scanner;

public class FunWithMath {

	/**
	 * takes two numbers and adds them
	 */
	public static void add(int num1, int num2){
		int total = num1 + num2;
		System.out.println(num1+" + "+num2+" = "+total);
	}
	/**
	 * takes two numbers and subtracts them
	 */
	public static void sub(int num1, int num2){
		int total = num1 - num2;
		System.out.println(num1+" - "+num2+" = "+total);
	}
	/**
	 * takes two numbers and multiplies them
	 */
	public static void mult(int num1, int num2){
		int total = num1 * num2;
		System.out.println(num1+" * "+num2+" = "+total);
	}
	/**
	 * takes two numbers and divides them
	 */
	public static void div(int num1, int num2){
		int total = num1 / num2;
		System.out.println(num1+" % "+num2+" = "+total);
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Enter two numbers:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		add(num1,num2);
		sub(num1,num2);
		mult(num1,num2);
		div(num1,num2);
	}

}
