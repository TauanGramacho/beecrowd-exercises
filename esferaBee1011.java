package estudo;

import java.util.Scanner;

public class esferaBee1011 {

	public static void main(String[] args) {
		 
		double R;
		final double PI = 3.14159;
		double volume;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite valor de R");
		
		R = sc.nextDouble();		
		 
		
		volume = (4/3)*(PI*Math.pow(R, 3));	
		
		   
		System.out.printf("VOLUME = " + "%.3f" , volume);                   
	                                 		
		                    		
		                    		
	}

}
