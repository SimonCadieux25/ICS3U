/**
 * PowersTable.java
 * gives a table of a number given by the user to the power of another number
 * Simon Cadieux
 * Nov 17 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class ElepsedTimeCalculator {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the first starting number: ");
		int start = scan.nextInt();
		System.out.print("Enter am or pm: ");
		String ampm = scan.nextLine();
		System.out.print("Enter the number of elapsed hours: ");
		int eHours = scan.nextInt();
		int time = 0;
		for (int i = 1;i<=eHours;i++){
			time = start + i;
		}
		if (time > 12 && ampm.equals("am")){
			time = time - 12;
			ampm = "pm";
		}
		else if (time > 12 && ampm.equals("pm")){
			time = time - 12;
			ampm = "pm";
		}
		System.out.println("The time is: "+ time + ampm);

	}

}
