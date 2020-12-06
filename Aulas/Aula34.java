package Aulas;
import java.util.Scanner;
import java.util.Locale;
public class Aula34 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas são ?");
		int hora = sc.nextInt();
	
		if (hora > 00 && hora < 13) { //Utilizando o '&&' como o 'and' do python
			System.out.println("Bom dia!"); //Se tiver apenas 1 comando dentro do if o '{}' é opcional !
		}
		else {
			if(hora >= 13 && hora < 18) {
				System.out.println("Boa tarde!");
			}
			else {
				System.out.println("Boa noite!");
			}
		}
		
		
		
	}
}
