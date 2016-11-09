/**
 * Random1.java
 * uses a random number to pic weather a name is the users favorite
 * Simon Cadieux
 * Nov 9 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class Random1 {


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		String Name = scan.nextLine();
		double perc;
		
		perc = Math.random();
		
		if (perc*100 <= 70){
			System.out.println(Name + " is your Favorite name.");
		}
		else if (perc*100 > 70){
			System.out.println(Name + " you hate that name.");
		}
		

	}

}
