package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class ExeOF02 {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi,raio,area;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		area = pi*Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n" ,area);
		
		
	}
}
