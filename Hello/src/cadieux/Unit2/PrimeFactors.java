/**
 * PrimeFactors.java
 * uses arithmatic to find the prime factors of a number given by the user
 * Simon Cadieux
 * Nov 14 2016
 */
package cadieux.Unit2;

import java.util.Scanner;


public class PrimeFactors {


	public static boolean isPrime(int n){
		for(int i = n-1;i>=2;i--){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int N = scan.nextInt();
		int i = 1;
		int x = 2;
		
		while(i<=(N)){
			if(isPrime(x)){
				System.out.println(x);
				i = i+1;
				
			}
			x = x + 1;
		}

	}

}
