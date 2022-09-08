package estudos;

import java.util.Scanner;

public class bee1036 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		double delta = Math.pow(b, 2)-4*(a*c);
		double R1 = (-b+Math.sqrt(delta))/(2*a);	
		double R2 = (-b-Math.sqrt(delta))/(2*a);	
		
		 
		if (delta > 0 && a!= 0 ) {
			System.out.println("R1"+"="+R1);
			System.out.println("R2"+"="+R2);
			
		}else {
			System.out.println("Impossível calcular");
			
		}			

	}

}
