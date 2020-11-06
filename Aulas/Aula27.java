package Aulas;
public class Aula27 {
	public static void main (String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b ,c;
		
		a = Math.sqrt(x); //Para tirar a raix quadrada
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + a);
		System.out.println("Raiz quadrade de " + y + " = " + b);
		System.out.println("Raiz quadrada de " + z + " = " + c);
		
		a = Math.pow(x, y); //Para fazer elevado
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " é igual a " + a);
		System.out.println(x + " elevado ao quadrado é igual a " + b);
		System.out.println("5 elevado ao quadrado é igual a " + c);
		
		a = Math.abs(y);
		b = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + a);
		System.out.println("Valor absoluto de " + z + " = " + b);
		
		
		
	}
	
}
