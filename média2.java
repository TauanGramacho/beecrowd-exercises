package estudo;

import java.util.Scanner;

public class média2 {

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
		
	    soma = (A+B+C);
	    
	    media  = (soma/(peso1+peso2+peso3));
	    
	    System.out.println("MÉDIA = " + media);
			
	}

}
