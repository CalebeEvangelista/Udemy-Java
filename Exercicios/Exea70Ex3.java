package Exercicios;

import java.util.Scanner;

public class Exea70Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        double p1,p2,p3,final_grade;

        name = sc.nextLine();
        p1 = sc.nextDouble();
        p2 = sc.nextDouble();
        p3 = sc.nextDouble();
        final_grade = p1 + p2 + p3;

        System.out.printf("FINAL GRADE = %.2f%n", final_grade);

        if (final_grade >= 90){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            double pass = (final_grade - 60.0) * -1;
            System.out.printf("MISSING %.2f POINTS", pass);
        }

        sc.close();
    }
}
