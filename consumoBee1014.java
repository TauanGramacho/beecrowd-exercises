package estudo;
import java.util.Locale;
import java.util.Scanner;
public class consumoBee1014 {

// x = distância total percorrida
// y = total de combustível gasto
// z = km/l	
	
	public static void main(String[] args) {
		
		int x;
		double y;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("distância total percorrida, em km: ");
	    x = sc.nextInt();
	    
	    System.out.println("combustível irradiado: ");
	    y = sc.nextDouble();
	    
	    double z = (x/y);
	    
	    System.out.printf("%.3fkm/l%n", z);
		
	    sc.close();
		
		
		
	}

}
