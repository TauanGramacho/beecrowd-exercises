package estudo;

import java.util.Locale;
import java.util.Scanner;

public class bônusBee1009 {
	
// sfx = salário fixo
// tvfm = total da venda feita por ele mesmo no mês
// sbn = salário bônus	
// sfn = salário final	
// pr  = porcentagem a receber	
// vv = valor de cada venda
// vdv = valor em dinheiro de quanto ele vendeu
	
	public static void main(String[] args) {
		
		

		String nome;
		double sfx;
        double tvfm;
        double sfn;
        double sbn;
        double vv;
        double vdv;
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nome do vendedor:");
		nome = sc.next();
		
		System.out.println("salário fixo dele:");
		sfx = sc.nextDouble();
		
		System.out.println("total de vendas feitas por ele no mês:");
		tvfm = sc.nextDouble();
		
		System.out.println("insira o valor de cada venda:");
		vv = sc.nextDouble();
		
		vdv = (tvfm*vv);		
		
		sbn = 0.15*vdv;
				
		sfn = sbn+sfx;
		
		System.out.printf("TOTAL " + " R$ " + " %.2f ", sfn);
		
				
	}

}
           