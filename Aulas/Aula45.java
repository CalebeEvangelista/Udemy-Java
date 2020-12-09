package Aulas;

import java.util.Scanner;

public class Aula45 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		x = sc.nextInt();
		y = 4;

		while (x < 5) {
			x += 1;
			y += 2;

			System.out.println(x + "-" + y);
		}
		
		System.out.println("Acabou!");
		
		sc.close();
	}
}
