package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula89 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vector = new double[n];

        for(int i = 0; i < n; i++){
            vector[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++){
            soma += vector[i];
        }

        double media = soma / n;

        System.out.printf("Media: %.2f%n", media);

        sc.close();
    }
}