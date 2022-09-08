package estudo;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		int valor1;
		int valor2;
		int peso1 = 4;
		int peso2 = 6;


		Scanner sc = new Scanner(System.in);

		System.out.println("digite o valor1:");
		valor1 = sc.nextInt();

		System.out.println("digite o valor 2");
		valor2 = sc.nextInt();

		if(valor1 >0 && valor1<=10 && valor2>0 && valor2<=10) {

			int media = (valor1*peso1)+(valor2*peso2)/(peso1+peso2);

			if (media>=6) {
				System.out.println("aprovado!");

			}else 
			{System.out.println("reprovado!");
			}


		}


	}



}	    





