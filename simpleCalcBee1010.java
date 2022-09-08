package estudo;

import java.util.Locale;
import java.util.Scanner;

public class simpleCalcBee1010 {

// pr1 = produto 1
// pr2 = produto 2
// qtd1 = quantidade produto 1
// qtd2 = quantidade produto 2
// prc1 = preço produto 1
// prc2 = preço produto 2	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int pr1 = sc.nextInt();		
        int qtd1 = sc.nextInt();
        double prc1 = sc.nextDouble(); 
        int pr2 = sc.nextInt();
        int qtd2 = sc.nextInt();               
        double prc2 = sc.nextDouble();      
        
        double VF = (qtd1*prc1)+(qtd2*prc2);
        
        System.out.printf("VALOR A PAGAR: " + "R$ " + "%.2f", VF);
        
        sc.close();
		
		
		
		
		
		
		
		
	}

}
