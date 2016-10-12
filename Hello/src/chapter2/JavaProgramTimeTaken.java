/**
 * JavaProgramTimeTaken
 * brakes up the time taken on a java program and shows what percent of time is used for each task
 * Simon Cadieux
 * Oct 11 2016
 */
package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class JavaProgramTimeTaken {


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		//Creating Variables
		double timeD;
		double timeC;
		double timeDe;
		double timeT;
		double totalTime;
		
		double D;
		double C;
		double De;
		double T;
		
		//Asks for numbers from user
		System.out.print("Time Designing(M): "); 
		timeD = scan.nextInt();
		System.out.print("Time Codeing(M): "); 
		timeC = scan.nextInt();
		System.out.print("Time Debuging(M): "); 
		timeDe = scan.nextInt();
		System.out.print("Time Testing(M): "); 
		timeT = scan.nextInt();
		
		//Background Math
		totalTime = (timeD + timeC + timeDe + timeT);
		D = ((timeD /totalTime)*100);
		C = ((timeC /totalTime)*100);
		De = ((timeDe /totalTime)*100);
		T = ((timeT /totalTime)*100);
		
		//Final output
		System.out.format("%-15s%-7s%-4s", "Task" , "% Time" , "\n");
		System.out.format("%-14s%-3s%-4s", "Designing" , df.format(D) , "%\n");
		System.out.format("%-15s%-3s%-4s", " Codeing" , df.format(C) , "%\n");
		System.out.format("%-15s%-3s%-4s", " Debuging" , df.format(De) , "%\n");
		System.out.format("%-15s%-3s%-4s", " Testing" , df.format(T) , "%\n");

		

	}

}
