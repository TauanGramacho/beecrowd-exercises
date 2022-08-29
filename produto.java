package estudo;

import java.util.Scanner;

public class produto {

	public static void main(String[] args) {
		int A;
		int B;
		int PROD;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o valor de A:");
		A = sc.nextInt();
		
		System.out.println("insira o valor de B");
		B = sc.nextInt();
		
		PROD = A*B;
		
		System.out.println("PROD = " + PROD);
		
				
	}

}
