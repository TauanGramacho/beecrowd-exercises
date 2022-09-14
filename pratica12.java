package testando;

import java.util.Scanner;

public class pratica12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("informe o 1º valor:");
		int valor1 = sc.nextInt();

		if(valor1 >= 0 && valor1 <=10) {

			System.out.println("informe o 2º valor:");
			int valor2 = sc.nextInt();

			if (valor2 >= 0 && valor2 <=10){	

				System.out.println("informe o 3º valor");

				int valor3 = sc.nextInt();

				if(valor3 >= 0 && valor3 <=10) {
					float media = (valor1+valor2+valor3)/3;

					if(media<6) {
						System.out.println("Reprovado!");

					}else {
						System.out.println("Aprovado!");
					}						

				}else {
					System.out.println("valor 3 fora do intervalo");
				}

			}else {
				System.out.println("valor 2 fora do intervalo");
			}

		}else {
			System.out.println("valor 1 fora do intervalo");
		}



	}

}
