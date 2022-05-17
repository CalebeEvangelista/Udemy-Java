package Exercicios.ExAula82;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o numero da conta: ");
        int numeroConta = Integer.parseInt(sc.nextLine());

        System.out.print("Entre com o nome do titular da conta: ");
        String nomeTitular = sc.nextLine();

        System.out.print("Terá um deposito inicial (S/n)? ");
        String opcao = sc.nextLine();
        
        double deposito = 0.0;
        if (Metodos.receberOpcao(opcao) == "S"){
            System.out.print("Digite o valor do deposito inicial: ");
            deposito = sc.nextDouble();
        } else {
            deposito = 0.0;
        }

        Conta x = new Conta(numeroConta, nomeTitular, deposito);

        System.out.print("Dados da conta: ");
        x.dadosConta();

        sc.close();
    }
}
