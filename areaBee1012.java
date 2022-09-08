package estudo;

import java.util.Scanner;

public class areaBee1012 {

	public static void main(String[] args) {
	    float A;
	    float B;
	    float C;
	    double PI = 3.14159;
        
	    Scanner sc = new Scanner(System.in);
	    System.out.println("insira valor A:");
	    A = sc.nextFloat();
	    
	    System.out.println("insira valor B");
	    B = sc.nextFloat();
	    
	    System.out.println("insira o valor C");
	    C = sc.nextFloat();
	    
	    System.out.println("A) A área do retângulo é " + (A*C)/2);
	    
	    System.out.printf("B) A área do círculo é " + "%.3f" , PI*Math.pow (C, 2));
	    System.out.println(" ");
	  
	    System.out.println("C) A área do trapézio é " + ((A/B)*C)/2);
	    
	    System.out.println("D) A área do quadrado é " + (B*B));
	    
	    System.out.println("E) A área do retângulo é " + A*B);
	    
	}
}