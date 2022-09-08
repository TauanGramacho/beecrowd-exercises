package estudo;
import java.util.Scanner;
public class médiaBee1005 {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;		
		
		double peso1 = 3.5;
		double peso2 = 7.5;
		
		double s;
		double average;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira nota 1:");
		nota1 = sc.nextDouble();
		
		System.out.println("insira nota2:");
		nota2 = sc.nextDouble();
		
		s = (nota1*peso1)+(nota2*peso2);
		
		average = s/(peso1+peso2);
		
		System.out.println("average = " + average);		
		
	}

}
