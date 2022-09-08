package estudo;

import java.util.Scanner;

public class médiaBee1006 {

	public static void main(String[] args) {
		float A, B, C;
		float peso1 = 2, peso2 = 3, peso3 = 5;
		
	    double soma; 
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a nota1");		
		A = sc.nextInt();
			
		System.out.println("digite a nota2");		
		B = sc.nextInt();
		
		System.out.println("digite a nota3");
		C = sc.nextInt();
		
	    soma = (A*peso1)+(B*peso2)+(C*peso3);
	    
	    media  = soma/(peso1+peso2+peso3);
	    
	    System.out.println("MÉDIA = " + media);
			
	}

}
