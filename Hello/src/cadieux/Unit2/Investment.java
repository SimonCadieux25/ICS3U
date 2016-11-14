/**
 * Investment.java
 * calculates the number of years it would take to get 5000 out of an initial investment of 2500 with a rate of %7.5 anualy
 * Simon Cadieux
 * Nov 14 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class Investment {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int iInvest = 2500;
		int fInvest = 5000;
		
		double cInvest = iInvest;
		double years = 1;
		
		while (cInvest <= fInvest){
			years = years + 1;
			cInvest = cInvest * 1.075;
			
		}
		System.out.println("It will take " + (int)years + " years");

	}

}
