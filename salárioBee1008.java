package estudo;

import java.util.Scanner;

public class salárioBee1008 {
	
// n   = número do funcionário	
// htm = horas trabalhadas em um mês
// vrh = valor que recebeu por hora	
// vfm = valor final do mês
// fiz vfm*20 assumindo que foram 20 dias úteis de trabalho
	
	public static void main(String[] args) {
		
		int n;
		int htm;
		float vrh;
	    double vfm;
	    
		Scanner sc = new Scanner(System.in);
        System.out.println("nº do funcionário: ");
        n = sc.nextInt();
        
        System.out.println("quantas horas esse funcionário trabalhou?: ");
        htm = sc.nextInt();
        
        System.out.println("quanto o funcionário " + n + " recebeu por hora?: ");
        vrh = sc.nextFloat();
        
        vfm = (htm*vrh)*20;
        
        System.out.println("NÚMERO = " + n);
        System.out.printf("SALÁRIO = " + "U$ " + "%.2f", vfm);            
        
	}

}
