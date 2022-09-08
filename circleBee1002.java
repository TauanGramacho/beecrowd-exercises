package estudo;
import java.util.Scanner;

public class circleBee1002 {

	public static void main(String[] args) {
		
	    double PI = 3.14159;
		int R = 2;
		float X;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o valor de R");
		R = sc.nextInt();				
			
		X = (float) (PI*Math.pow(R, 2));
		
		
		System.out.println("A = " + X );

	}

}
