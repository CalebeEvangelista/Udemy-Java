package Aulas;
import java.util.Scanner;
import java.util.Locale;

public class Aula55 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char resp;
		
		do {
			System.out.print("Digite uma temperatura em Celsius: ");
			double c = sc.nextDouble();
			double op = (9.0 * c / 5.0) + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.1f%n" ,op);
			System.out.print("Deseja repetir a conversão? (s/n) ");
			resp = sc.next().charAt(0);
		} while (resp == 's');
		
		System.out.println("########## Fim do programa! ##########");
		
		
		sc.close();
	}

}
