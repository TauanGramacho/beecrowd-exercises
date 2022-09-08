package estudo;

import java.util.Scanner;

public class yearInDaysBee1020 {

	public static void main(String[] args) {
		
		int ano;
		int mes;
		int dias;
		int idade;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite uma idade:");
		idade = sc.nextInt();
		
		ano = idade/365;
		idade = idade%365;
		
		mes = idade/30;
		idade = idade%30;
		
		dias = idade;
				
        System.out.println(ano + " ano(s), " + mes + " mês(es), " + dias + " dia(s)");
        
	}

}
