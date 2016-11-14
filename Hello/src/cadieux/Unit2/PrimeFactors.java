/**
 * PrimeFactors.java
 * uses arithmatic to find the prime factors of a number given by the user
 * Simon Cadieux
 * Nov 14 2016
 */
package cadieux.Unit2;

import java.util.Scanner;


public class PrimeFactors {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double num;
		System.out.print("Enter a number: ");
		num = scan.nextInt();
		
		int count = 2;
		
		while (count <= num){
			if (num % count == 0){
				System.out.println(count);
				num = num / count;
			}
			else{
				count = count + 1;
			}
		}
		

	}

}
