package estudo;

import java.util.Locale;
import java.util.Scanner;

public class RAIZBee1015 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// *P1*
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		// *P2*
		
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double q = Math.pow(x2-x1, 2) + Math.pow((y2-y1), 2);
		
		System.out.printf("%.4f" , Math.sqrt(q));
		

	}

}
