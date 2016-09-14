package cadieux;

/* aboutMe.java
 * Print out information
 * september 13, 2016
 * Simon Cadieux
 */
public class aboutMe {

	public static void main(String[] args) {
		
		System.out.println("Simon C.");
		System.out.println("Kemp");
		System.out.println("Runnymede C.I.");
		System.out.println("\"Go Ravens Go!\"");
		
		System.out.format("%-10s %8s %18s","Weekdays,\t","Class Code,\t","Class Start Times\n");
		System.out.format("%-10s %8s %8s","Monday-Friday\t","SPH3U1-01\t","08:45am\n");
		System.out.format("%-10s %8s %8s","Monday-Friday\t","AMQ3M1-02\t","10:07am\n");
		System.out.format("%-10s %8s %8s","Monday-Friday\t","ICS3U1-01\t","12:26pm\n");
		System.out.format("%-10s %8s %8s","Monday-Friday\t","ENG3U1-01\t","13:48pm\n");
	}

}
