package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class ExeOF08 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, divisao;
		
		num = sc.nextInt();
		divisao = num % 2; 
		
		if (divisao == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
			
		}
	}
}
