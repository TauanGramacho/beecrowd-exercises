package estudo;

import java.util.Locale;

import java.util.Scanner;

public class notasemoedasBEE1021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nFloat = sc.nextInt();
	    
		System.out.println("NOTAS:");
		
		System.out.println(nFloat/100 + " notas de R$ 100,00");
		nFloat = nFloat%100;
		System.out.println(nFloat/50 + " nota(s) de R$ 50,00");
		nFloat = nFloat%50;
		System.out.println(nFloat/20 + " nota(s) de R$ 20,00");
		nFloat = nFloat%20;
		System.out.println(nFloat/10 + " nota(s) de R$ 10,00");
		nFloat = nFloat%10;
		System.out.println(nFloat/5 + " nota(s) de R$ 5,00");
		nFloat = nFloat%5;
		System.out.println(nFloat/2 + " nota (s) s) de R$ 2,00");
		nFloat = nFloat%2;		
		System.out.println(nFloat/1 + " moeda(s) de R$ 1,00");
		nFloat = nFloat%1;
		
		System.out.println("MOEDAS:");
		
		System.out.println(nFloat/0.50 + " moeda(s) de R$ 0,50");
	    double nDouble = nFloat%0.50;
		System.out.println(nDouble/0.20 + " moeda(s) de R$ 0,25");
		nDouble = nDouble%0.20;
		System.out.println(nDouble/0.10 + " moeda(s) de R$ 0,10");
		nDouble = nDouble%0.10;
		System.out.println(nDouble/0.05 + " moeda(s) de R$ 0,05");
		nDouble = nDouble%0.05;
		System.out.println(nDouble/0.01 + " moeda(s) de R$ 0,01");
		nDouble = nDouble%0.01;	
		
	}

}
