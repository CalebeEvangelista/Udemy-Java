package Exercicios.ExAula82;

public class Conta {
    
    private int conta;
    private String nome;
    private double deposito;

    public Conta(int conta, String nome, double deposito){
        this.nome = nome;
        this.deposito = deposito;
        this.conta = conta;
    }

    public void dadosConta(){
        
        if (getDeposito() > 0) {
            System.out.println( getNome() + ' ' + getConta() + ' ' + getDeposito());
        } else {
            System.out.println( getNome() + ' ' + getConta());
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getConta(){
        return conta;
    }
    
    public void setConta(int conta){
        this.conta = conta;
    }

    public double getDeposito() {
        return deposito;
    }
    
    public void setDeposito(double deposito){
        this.deposito = deposito;
    }
}
