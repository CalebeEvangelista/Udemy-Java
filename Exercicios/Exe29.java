package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class Exe29 {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double larg,comp,metq,area,preco;
		
		larg = sc.nextDouble();
		comp = sc.nextDouble();
		metq = sc.nextDouble();
		
		area = larg * comp;
		preco = area * metq;
		System.out.printf("AREA = %.0fM²%n" ,area); 
		System.out.printf("PREÇO = R$%.2f%n", preco);
		
		sc.close();
		
		
	}
}
