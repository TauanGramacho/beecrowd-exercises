package estudo;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		float A; 
		float B;	
		float X;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("A");
		A = sc.nextFloat();

		System.out.println("B");
		B = sc.nextFloat();
		
	    X = (A+B);

		System.out.print("X = " + X);


	}

}
