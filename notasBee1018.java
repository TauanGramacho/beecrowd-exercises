package estudo;

import java.util.Scanner;

public class notasBee1018 {

// n = número	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		

		System.out.println( n/100 + "nota(s) de R$ 100,00" );
		n = n % 100;
		System.out.println( n/50 + "nota(s) de R$ 50,00");
		n = n % 50;
		System.out.println( n/20 + "nota(s) de R$ 20,00");
		n = n % 20;
		System.out.println( n/10 + "nota(s) de R$ 10,00");
		n = n % 10;
		System.out.println( n/5 + "nota(s) de R$ 5,00");
		n = n % 5;
		System.out.println( n/2 + "nota(s) de R$ 2,00");
		n = n % 2;
		System.out.println( n/1 + "nota(s) de R$ 1,00");
		n = n % 1;
	  
				
	}

}
