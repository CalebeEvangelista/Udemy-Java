package Exercicios;

import java.util.Scanner;

public class ExeA70Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        double gross_salary,tax,percentage,update_salary;

        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Gross salary: ");
        gross_salary = sc.nextDouble();
        System.out.print("Tax: ");
        tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", name,(gross_salary - tax));

        System.out.print("Which percentage to increase salary ? ");
        percentage = sc.nextDouble();
        percentage = percentage / 100;

        update_salary = (gross_salary - tax) + (gross_salary * percentage);
        System.out.printf("Updated data: %s, $ %.2f%n", name, update_salary);

        sc.close();
    }
}
