package estudo;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		float nota1, nota2, nota3;
		float peso1 = 2, peso2 = 3, peso3 = 5;
		
		float soma; 
		float media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a nota1");		
		nota1 = sc.nextFloat();
			
		System.out.println("digite a nota2");		
		nota2 = sc.nextFloat();
		
		System.out.println("digite a nota3");
		nota3 = sc.nextFloat();
		
	    soma = (nota1)+(nota2)+(nota3);
	    
	    media  = soma/(peso1+peso2+peso3);
	    
	    System.out.println(soma);
		
		
		
		
	}

}
