package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class ExeOF04 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num,hrs;
		double hora,calculo;
		
		num = sc.nextInt();
		hrs = sc.nextInt();
		hora = sc.nextDouble();
		calculo = hrs * hora;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n" , calculo);
		
		sc.close();
	}
}