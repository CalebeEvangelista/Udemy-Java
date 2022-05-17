package Exercicios.ExAula82;

public class Metodos {

    public static String receberOpcao(String opcao){
        try {
            opcao.toUpperCase();
            System.out.println(opcao);
            if (opcao == "s" | opcao == "S"){
                System.out.println("CARAIIIIIIIIIII");
                return "S";
            } else {
                System.out.println("CARAIIIIIIIIIII com N");
                return "N";
            }
        } catch (Exception e) {
            System.out.println("Digite uma opção valida!");
            return null;
        }
    }
}
