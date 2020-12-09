package Aulas;

import java.util.Scanner;

public class Aula38 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) { // Serve pra subistituir uma penca de 'if' e 'else';
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		
	}
}
