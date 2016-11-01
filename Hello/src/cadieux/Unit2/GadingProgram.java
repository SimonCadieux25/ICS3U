/**
 * GradingProgram.java
 * Gives a letter grade based on a percentage given by the user
 * Simon Cadieux
 * Nov 1 2016
 */
package cadieux.Unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GadingProgram {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		System.out.print("Enter your percentage mark: ");
		int percentage = scan.nextInt();
		char Grade;
		
		if (percentage>90){
			Grade = 'A';
		}
		else if (percentage>70){
			Grade = 'B';
		}
		else if (percentage>60){
			Grade = 'C';
		}
		else if (percentage>50){
			Grade = 'D';
		}
		else {
			Grade = 'F';
		}
		
		System.out.println("The Corosponding letter grade is: " + Grade);

	}

}
