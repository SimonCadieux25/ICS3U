package cadieux.Unit2;

/**
 * PosNegDevisibalBy7.java
 * checks if a number is posative or negative and if it is devisible by 7
 * Simon Cadieux
 * Oct 31 2016
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class PosNegDevisibalBy7 {


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		System.out.print("Please enter a number");
		int Num = scan.nextInt();
		
		if (Num >0){
			System.out.println(Num+" is a posative number");
		}
		else {
			System.out.println(Num+" is a Negative number");
		}
		
		if (Num%7==0){
			System.out.println(Num+" is Divisable by 7");
		}
		else{
			System.out.println(Num+" is not Divisable by 7");
		}
	}

}
