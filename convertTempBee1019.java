package estudo;

import java.util.Locale;
import java.util.Scanner;

public class convertTempBee1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdHoras;
		int qtdMinutos;
		int qtdSegundos;
		int num;
		
		Locale.setDefault(Locale.US);
		
		System.out.println("insira um numero: ");
		num = sc.nextInt();
		
		qtdHoras = num / 3600;
		qtdSegundos = num % 3600;
		
		qtdMinutos = num/60;
		num = num%60;
		
		qtdSegundos = num;			
		
		System.out.println(qtdHoras + ":" + qtdMinutos + ":" + qtdSegundos);
		
	   	sc.close();

	}

}
