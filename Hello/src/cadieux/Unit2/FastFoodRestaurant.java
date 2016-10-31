package cadieux.Unit2;

/*
 * FastFoodRestaurant.java
 * Crates a recipt for a fast food restaurant
 * Simon Cadieux
 * Oct 6 2016
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class FastFoodRestaurant {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 DecimalFormat df = new DecimalFormat ("0.00");
		
		int numofb;
		int numoff;
		int numofs;
		double tax = 0.065;
		double amountpaid;
		
		double priceofb = 1.69;
		double priceoff = 1.09;
		double priceofs = 0.99;
		
		double beforetax;
		double total;
		double taxcal;
		double change;
		
		System.out.print("Enter the number of burgers: "); 
		numofb = scan.nextInt();
		System.out.print("Enter the number of fries: "); 
		numoff = scan.nextInt();
		System.out.print("Enter the number of sodas: "); 
		numofs = scan.nextInt();
		
		beforetax = ((priceofb*numofb)+(priceoff*numoff)+(priceofs*numofs));
		
		System.out.println("Total Before Tax: $"+ df.format(beforetax));
		
		taxcal = (beforetax*tax);
		
		System.out.println("Tax: $"+ df.format(taxcal));
		
		total = (taxcal+beforetax);
		
		System.out.println("Total: $"+ df.format(total));
		
		System.out.print("\n Enter amount tendered: $"); amountpaid = scan.nextInt();
		
		change = (amountpaid-total);
		
		System.out.println("Change: $"+df.format(change));
		
		

	}

}
