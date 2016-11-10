/**
 * RandomGen.java
 * Generates a random number using a Congruential method
 * Simon Cadieux
 * Nov 10 2016
 */
package cadieux.Unit2;

import java.text.DecimalFormat;

public class RandomGen {

	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("0.00");
		
		final double a = 42552367342.425256738978322625674822657278934103453145351354354215145583746328167432944385756475395867170951797689109846547658934590158463509167493560934856719039023856704167501957167894561905743405615910548567465903591671349875901562735604985715896495694015684895763875904639408564908576589175984576395124367;
		final double c = 27533542.6667625634715774568146572372567254521597666652366666766667771543178;
		final double m = 50.9898989801223125472454656786877237752754756587643554612551515413511;
		final int seed = 13;
		
		double X0;
		double X1;
		double X2;
		double X3;
		double X4;
		double X5;
		double X6;
		double X7;
		double X8;
		double X9;
		
		X0 = (a * seed + c) % m;
		X1 = (a * X0 + c) % m;
		X2 = (a * X1 + c) % m;
		X3 = (a * X2 + c) % m;
		X4 = (a * X3 + c) % m;
		X5 = (a * X4 + c) % m;
		X6 = (a * X5 + c) % m;
		X7 = (a * X6 + c) % m;
		X8 = (a * X7 + c) % m;
		X9 = (a * X8 + c) % m;
		
		System.out.println(df.format(X0));
		System.out.println(df.format(X1));
		System.out.println(df.format(X2));
		System.out.println(df.format(X3));
		System.out.println(df.format(X4));
		System.out.println(df.format(X5));
		System.out.println(df.format(X6));
		System.out.println(df.format(X7));
		System.out.println(df.format(X8));
		System.out.println(df.format(X9));
		

	}

}
