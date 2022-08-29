package estudo;
import java.util.Scanner;
public class diferença {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		int D;
        int diff; 
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite valor de A:");
		A = sc.nextInt();
		
		System.out.println("digite valor de B:");
		B = sc.nextInt();
		
		System.out.println("digite valor de C:");
		C = sc.nextInt();
		
		System.out.println("digite valor de D");
		D = sc.nextInt();
		
		diff = ((A*B)-(C*D));
		
		System.out.println("DIFERENÇA = " + diff);
				
	}

}
