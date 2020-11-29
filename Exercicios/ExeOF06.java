package Exercicios;
import java.util.Scanner;
import java.util.Locale;
public class ExeOF06 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,pi,tri,cir,tra,qua,ret;
		a = sc.nextDouble(); 
		b = sc.nextDouble();
		c = sc.nextDouble();
		pi = 3.14159;
		
		tri = (a*c)/2;
		cir = pi * Math.pow(c, 2);
		tra = (c*(a+b))/2;
		qua = b * b;
		ret = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n" ,tri);
		System.out.printf("CIRCULO: %.3f%n" ,cir);
		System.out.printf("TRAPEZIO: %.3f%n" ,tra);
		System.out.printf("QUADRADO: %.3f%n" ,qua);
		System.out.printf("RETANGULO: %.3f%n" ,ret);
		
		sc.close();
	}
}