/**
 * CoppyCompany.java
 * changes the price of coppies based on how manny coppies the user wants
 * Simon Cadieux
 * Oct 31 2016
 */


package cadieux.Unit2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CoppyCompany {


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		System.out.print("Enter the number of copies you would like");
		int NumCop = scan.nextInt();
		double price;
		
		if (NumCop>1000){
			price = 0.25;
		}
		else if (NumCop>750){
			price = 0.26;
		}
		else if (NumCop>500){
			price = 0.27;
		}
		else if (NumCop>100){
			price = 0.28;
		}
		else{
			price = 0.30;
		}
		
		System.out.println("Price per copy is: $" + price);
		System.out.println("Total cost is: $" + (price*NumCop));
	}

}
