package cadieux;

/* AboutMe.java
 * Print out information
 * September 13, 2016
 * Simon Cadieux
 */
public class AboutMe {

	public static void main(String[] args) {
		
		System.out.println("Simon C.");
		System.out.println("Kemp");
		System.out.println("Runnymede C.I.");
		System.out.println("\"Go Ravens Go!\"");
		
		System.out.format("%-15s %14s %18s","Weekdays,  ","Class Code,   ","Class Start Times \n");
		System.out.format("%-14s %14s %8s","Monday-Friday  ","SPH3U1-01     ","08:45am\n");
		System.out.format("%-14s %14s %8s","Monday-Friday  ","AMQ3M1-02     ","10:07am\n");
		System.out.format("%-14s %14s %8s","Monday-Friday  ","ICS3U1-01     ","12:26pm\n");
		System.out.format("%-14s %14s %8s","Monday-Friday  ","ENG3U1-01     ","13:48pm\n");
	}

}
