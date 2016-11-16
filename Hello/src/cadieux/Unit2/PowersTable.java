/**
 * PowersTable.java
 * gives a table of a number given by the user to the power of another number
 * Simon Cadieux
 * Nov 16 2016
 */
package cadieux.Unit2;

import java.util.Scanner;

public class PowersTable {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.format("%6s%6s%6s%6s%6s%1s","X^1","X^2","X^3","X^4","X^5","\n");
		for(int i = 1;i<=6;i++){
		System.out.format("%6s%6s%6s%6s%6s%1s",(int)Math.pow(i , 1),(int)Math.pow(i , 2),(int)Math.pow(i , 3),(int)Math.pow(i , 4),(int)Math.pow(i , 5),"\n");
		}
	}

}
