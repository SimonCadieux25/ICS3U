/**
 * SwitchDemo.java
 * Uses a switch statement to print the proper month
 * Simon Cadieux
 * Nov 3 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class SwitchDemo {


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int Day;
		String daystring;
		
		System.out.print("Enter the day 1-7 Mon-Sun: ");
		Day = scan.nextInt();
		
		switch (Day)
		{
		case 1: daystring = "Monday";
				break;
		case 2: daystring = "Tuesday";
				break;
		case 3: daystring = "Wednesday";
				break;
		case 4: daystring = "Thursday";
				break;
		case 5: daystring = "Friday";
				break;
		case 6: daystring = "Saturday";
				break;
		case 7: daystring = "Sunday";
				break;
		default: daystring = "An Invalid Day";
				break;
		}
		
		System.out.println("The " + Day + " of the week is " + daystring);
	}

}
