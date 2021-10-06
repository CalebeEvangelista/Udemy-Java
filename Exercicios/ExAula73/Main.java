package ExAula73;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dolar_price, dolar_bought;
        
        System.out.print("What is the dollar price ? ");
        dolar_price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        dolar_bought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.total(dolar_price,dolar_bought));

        sc.close();
    }
}
