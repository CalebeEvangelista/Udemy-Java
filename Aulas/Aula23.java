package Aulas;

import java.util.Locale; //Importando a bibiloteca Locale para o java (Colocar o L sempre maiusculo !)

public class Aula23 {
	public static void main (String[] args) {

		int y = 32; //Número inteiro em java = int (nome da variavel) = (valor da variavel em número inteiro)
		double x = 10.35784; //Número fracionado ou double em java = double (nome da variavel) = (valor da variavel) 
		double soma = x + y;
		System.out.println(y);
		System.out.println(x);
		System.out.println("Bom Dia!");
		System.out.printf("%.2f%n" , x); //Print formatado colocando o '%' no inicio o '.2f' pra falar quantas casas quer e o '%n' para dar a quebra de linha e acabar
		Locale.setDefault(Locale.US); //Serve pra setar o idioma Default do programa para cada linha abaixo dessa
		System.out.printf("%.4f%n" , x); 
		System.out.println("Resultado de x + y = " + soma); //Para concatenar varios elementos basta somente colocar um '+' entre eles
		System.out.printf("Resultado de X + Y = %.2f%n", x+y); //Concatenado com o printf
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		System.out.printf("%s ganha R$%.2f com apenas %d anos.%n", nome, renda , idade); //%s para formatar Strings, %.xf para formatar numero float e %d para formatar números
	
	}
}