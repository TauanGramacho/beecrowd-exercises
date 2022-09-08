package estudo;

import java.util.Scanner;

public class combustívelGastoBee1017 {

	public static void main(String[] args) {

// tempo
// vm = velocidade média		
// ln = litros necessários
		
		Scanner sc = new Scanner(System.in);
		
		float tempo = sc.nextFloat();
		float vm = sc.nextFloat();
		
		float ln = (tempo*(vm/12));
		
		System.out.printf( "%.3f" , ln);	
		
	}	

}
