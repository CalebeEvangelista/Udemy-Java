package Aulas;
import java.util.Scanner;
public class Aula26 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String c , b, a;
		
		x = sc.nextInt();
		sc.nextLine(); //necessario fazer para consumir a linha pendente do 'sc.nextInt()' 
		c = sc.nextLine(); //Serve para ler um testo até a quebra da sua linha 
		b = sc.nextLine();
		a = sc.nextLine();
		
		System.out.println(x);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
	}
}
