/**
 * GroupAssingnment.java
 * puts people into groups based on the first letter of the first name and the last name
 * Simon Cadieux
 * Dec 1 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class GroupAssingnment {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = scan.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = scan.nextLine();

		int groupfirst = 0;
		int grouplast = 0;
		int group;

		char firstI = firstName.charAt(1);
		char lastI = firstName.charAt(1);

		int firstInt = 0;
		int lastInt = 0;
		
		switch(firstInt){
		case 'A': groupfirst = 1;
		break;
		case 'B': groupfirst = 1;
		break;
		case 'C': groupfirst = 1;
		break;
		case 'D': groupfirst = 1;
		break;
		case 'E': groupfirst = 1;
		break;
		case 'F': groupfirst = 1;
		break;
		case 'G': groupfirst = 1;
		break;
		case 'H': groupfirst = 1;
		break;
		case 'I': groupfirst = 1;
		break;
		case 'J': groupfirst = 2;
		break;
		case 'K': groupfirst = 2;
		break;
		case 'L': groupfirst = 2;
		break;
		case 'M': groupfirst = 2;
		break;
		case 'N': groupfirst = 2;
		break;
		case 'O': groupfirst = 2;
		break;
		case 'P': groupfirst = 2;
		break;
		case 'Q': groupfirst = 2;
		break;
		case 'R': groupfirst = 2;
		break;
		case 'S': groupfirst = 2;
		break;
		case 'T': groupfirst = 3;
		break;
		case 'U': groupfirst = 3;
		break;
		case 'V': groupfirst = 3;
		break;
		case 'W': groupfirst = 3;
		break;
		case 'X': groupfirst = 3;
		break;
		case 'Y': groupfirst = 3;
		break;
		case 'Z': groupfirst = 3;
		break;
		
		}
		switch(lastInt){
		case 'A': grouplast = 1;
		break;
		case 'B': grouplast = 1;
		break;
		case 'C': grouplast = 1;
		break;
		case 'D': grouplast = 1;
		break;
		case 'E': grouplast = 1;
		break;
		case 'F': grouplast = 1;
		break;
		case 'G': grouplast = 1;
		break;
		case 'H': grouplast = 1;
		break;
		case 'I': grouplast = 1;
		break;
		case 'J': grouplast = 2;
		break;
		case 'K': grouplast = 2;
		break;
		case 'L': grouplast = 2;
		break;
		case 'M': grouplast = 2;
		break;
		case 'N': grouplast = 2;
		break;
		case 'O': grouplast = 2;
		break;
		case 'P': grouplast = 2;
		break;
		case 'Q': grouplast = 2;
		break;
		case 'R': grouplast = 2;
		break;
		case 'S': grouplast = 2;
		break;
		case 'T': grouplast = 3;
		break;
		case 'U': grouplast = 3;
		break;
		case 'V': grouplast = 3;
		break;
		case 'W': grouplast = 3;
		break;
		case 'X': grouplast = 3;
		break;
		case 'Y': grouplast = 3;
		break;
		case 'Z': grouplast = 3;
		break;
		}
		if(groupfirst>=grouplast){
			group = grouplast;
		}
		else{
			group = groupfirst;
		}
		
		System.out.println(firstName + " " + lastName + " is assigned to Group " + group);

	}

}
