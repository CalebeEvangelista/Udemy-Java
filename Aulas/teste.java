package Aulas;
import java.util.Scanner;

public class teste {
	public static void main (String[] args) {
		int n1,n2,soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um nuúmero: ");
		n1 = sc.nextInt();
		System.out.print("Digite outro número: ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println("A soma é " + soma);
		
		sc.close();
	}
	
	
}
