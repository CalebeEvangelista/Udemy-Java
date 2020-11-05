package Aulas;
public class Aula24 {
	
	public static void main (String[] args) {
		
		int x, y; //Atribui 'int' a todas essas variaveis
		x = 5;
		y = 2*x;
		System.out.println(x);
		System.out.println(y);
				
		// Int + double
		int z;
		double c;
		z = 5;
		c = 2*x;
		System.out.println(z);
		System.out.println(c);
		
		//Area do trapezio
		// Sempre é bom indicar o tipo do número (int,double,float)
		
		double b,B,h,area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2 * h; //Formula da área do trapezio
		
		System.out.println(area);
		
		//Conversão explicita dos valores (Casting)
		
		int a,d;
		double resultado,resultado2;
		
		a = 5;
		d = 2;
		resultado = (double) a/d; //Sem colocar a intenção de conversão (double) os numeros serão divididos e exibido somente a parte inteira
		resultado2 = a/d;
		System.out.println(resultado); //Resultado com o casting para double
		System.out.println(resultado2); //Resultado sem o casting
		
		double f;
		int g;
		
		f = 5.0;
		g = (int) f; //Sem o casting acusara erro pois não pode converter de double pra int sem perder informações
		
		System.out.println(g);	
	}
}