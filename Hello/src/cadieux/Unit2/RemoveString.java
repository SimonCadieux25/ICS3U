/**
 * RemoveString.java
 * gets a sentance from the user then asks what they want to remove and removes it
 * Simon Cadieux
 * Nov 29 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class RemoveString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String sentance;
		String remove;
		
		System.out.print("Enter a sentance: ");
		sentance = scan.nextLine();
		System.out.print("Enter a string: ");
		remove = scan.nextLine();
		
		sentance = sentance.replace(remove , "");
		System.out.println(sentance);
	}

	

}
