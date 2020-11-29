package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class ExeOF05 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1,cod2,num1,num2;
		double val1,total1,val2,total2,totalt;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		val1 = sc.nextDouble();
		total1 = num1 * val1;
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		val2 = sc.nextDouble();
		total2 = num2 * val2;
		
		totalt = total1 + total2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",totalt);
		
		sc.close();
	}
}