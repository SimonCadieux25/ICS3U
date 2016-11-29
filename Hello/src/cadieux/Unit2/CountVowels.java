/**
 * CountVowels.java
 * counts the number of vowels in a sentance
 * Simon Cadieux
 * Nov 29 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class CountVowels {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num = 0;
		String sent;
		
		
		System.out.print("Enter a sentance: ");
		sent = scan.nextLine();

		for (int i = 1;i<=(sent.length()-1);i++){
			if(sent.charAt(i)=='a'||sent.charAt(i)=='e'||sent.charAt(i)=='i'||sent.charAt(i)=='o'||sent.charAt(i)=='u'){
				num = num + 1;
			}
			else{
				
			}
		}
		System.out.println("The number of vowels in " + sent + " is " + num);
	}

}
