package cadieux.Unit2;


/**
 * RollingDice.java
 * Rolls 2 six sided die 10000 times
 * Simon Cadieux
 * Dec 6 2016
 */


public class RollingDice {

	
	public static void main(String[] args) {
		
		int[] timesHappend = {0,0,0,0,0,0,0,0,0,0,0};
		
		for(int i = 1; i<=10000; i++){
			int die1 = (int)(Math.random()*6)+1;
			int die2 = (int)(Math.random()*6)+1;
			
			int totalRoll = die1 + die2;
			
			timesHappend[totalRoll-2] = timesHappend[totalRoll-2] + 1;
		}
		System.out.println("Total             Number of Times this Happened");
		System.out.println(" 2                          " + timesHappend[0]);
		System.out.println(" 3                          " + timesHappend[1]);
		System.out.println(" 4                          " + timesHappend[2]);
		System.out.println(" 5                          " + timesHappend[3]);
		System.out.println(" 6                          " + timesHappend[4]);
		System.out.println(" 7                          " + timesHappend[5]);
		System.out.println(" 8                          " + timesHappend[6]);
		System.out.println(" 9                          " + timesHappend[7]);
		System.out.println(" 10                         " + timesHappend[8]);
		System.out.println(" 11                         " + timesHappend[9]);
		System.out.println(" 12                         " + timesHappend[10]);
	}

}
