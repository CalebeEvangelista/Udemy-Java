package Aulas;
import java.util.Scanner; //Biblioteca que o Scanner pertence
import java.util.Locale;

public class Aula25 {
	public static void main (String[] args) {
		
		//Utilizando o Scanner
		Scanner sc = new Scanner(System.in); //Função para ativar a utilização do Scanner
		
		String nome;
		int numero;
		double numerod;
		char letra;
		
		Locale.setDefault(Locale.US); //Agora só vai double com ponto
		
		nome = sc.next(); //'Sc.next()' utilizado quando for escrever uma palavra sem espaços
		numero = sc.nextInt(); //'Sc.nextInt()' utilizado para escrever numeros inteiros
		numerod = sc.nextDouble(); //Para escrever um numero com ponto flutuante
		letra = sc.next().charAt(0); //Para escrever um caractere
		
		System.out.println("Você escreveu: " + nome);
		System.out.println("Você digitou o número: " + numero);
		System.out.println("Você digitou o numero: " + numerod);
		System.out.println("Você digitou o caractere: " + letra);
		
		
	}
}
