package Aulas;
import java.util.Scanner;
import java.util.Locale;
public class Aula34 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas são ?");
		int hora = sc.nextInt();
	
		if (hora > 00 && hora < 13) {
			System.out.println("Bom dia!");
		}
		if(hora >= 13 && hora < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		
		
		
		
	}
}
