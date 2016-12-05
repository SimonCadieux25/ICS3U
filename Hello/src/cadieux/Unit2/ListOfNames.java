/**
 * ListOfNames.java
 * gets a list of names from the user and prints them in order and reverse
 * Simon Cadieux
 * Dec 5 2016
 */

package cadieux.Unit2;

import java.util.Scanner;

public class ListOfNames {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter the number of names: ");
		int n = scan.nextInt();
		scan.nextLine();
		
		String[] names = new String[n];
		
		for(int i = 0; i<n;i++){
			System.out.print("Enter a name: ");
			names[i] = scan.nextLine();
		}
		System.out.println("");
		for(int i2 = 0; i2<n; i2++){
			System.out.println(names[i2]);
		}
		System.out.println("");
		for(int i3 = n-1; i3>=0; i3--){
			System.out.println(names[i3]);
		}
	}

}
