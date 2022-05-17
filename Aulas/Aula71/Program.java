package Aulas.Aula71;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circumferencia(raio);
        double v = Calculator.volume(raio);

        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);

        sc.close();
    }
}

