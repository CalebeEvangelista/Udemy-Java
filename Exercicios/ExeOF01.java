package Exercicios;
import java.util.Scanner;
public class ExeOF01 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
		
		int v1,v2,soma;
		
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		soma = v1 + v2;
		
		System.out.println("SOMA = " + soma);
				
		sc.close(); 		
	}
}
