package Exercicios;

import java.util.Scanner;

public class ExeA70Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base,altura,area,perimeter,diagonal;

        System.out.print("Enter rectangle width and height: ");
        base = sc.nextDouble();
        altura = sc.nextDouble();

        area = base * altura;
        perimeter = base + altura + base + altura;
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PERIMETER = %.2f%n" ,perimeter);
        System.out.printf("DIAGONAL = %.2f%n" ,diagonal);

        sc.close();
    } 
}
