package testando;

import java.util.Scanner;

public class pratica13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		double a = sc.nextInt(), b = sc.nextInt();
		
		
		if (a >= 0 && a<=10 && b >= 0 && b <=10) {
		
			System.out.println("Qual operação deseja fazer?, digite {1} para somar, {2} para subtrair, {3} para multiplicar e {4} para dividir");	
		int op1 = sc.nextInt();
		switch (op1) {
		
		case 1:
			double soma = a+b;			
            System.out.println("soma = " + soma);
            break;
		case 2:
			double subtração = a-b;
			System.out.println("subtração = " + subtração);
			break;

		case 3:
			double multiplicação = a*b;
			System.out.println("multiplicação = " + multiplicação);
			break;

		case 4:
			double divisão = a/b;
			System.out.println("divisão= " + divisão);
			break;
			
		default:
			System.out.println("VALOR FORA DO INTERVALO");

		}

		}else {
			System.out.println("valor fora do intervalo");
		}

	}
}
