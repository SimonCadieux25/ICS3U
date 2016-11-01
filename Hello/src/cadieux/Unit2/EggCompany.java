/**
 * EggCompany.java
 * changes the price of eggs based on how dozens of eggs the user wants
 * Simon Cadieux
 * Nov 1 2016
 */
package cadieux.Unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EggCompany {


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int NumDozEgg;
		double price;
		
		System.out.print("Enter how manny dozens of eggs would you like? ");
		NumDozEgg =  scan.nextInt();
		
		if (NumDozEgg >= 11){
			price = 0.35;
		}
		else if (NumDozEgg >= 6){
			price = 0.40;
		}
		else if (NumDozEgg >= 4){
			price = 0.45;
		}
		else{
			price = 0.50;
		}
		
		System.out.println("The number of eggs perchased $" + (NumDozEgg*12));
		System.out.println("The price per dozen is $" + price);
		System.out.println("The total price is: $"+ (price*NumDozEgg));
		
		
		
	}

}
