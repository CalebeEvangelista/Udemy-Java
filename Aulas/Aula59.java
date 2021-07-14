package Aulas;
import java.util.Scanner;

public class Aula59 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String original,s1,s2,s3,s4,s5,s6,s7;
		int i,j;
		
		original = "abcde DGHIJ ABC abc DEFG   ";
		s1 = original.toLowerCase();
		s2 = original.toUpperCase();
		s3 = original.trim();
		s4 = original.substring(2);
		s5 = original.substring(2, 9);
		s6 = original.replace('a', 'x');
		s7 = original.replace("abc", "xy");
		i = original.indexOf("bc");
		j = original.lastIndexOf("bc");
		
		System.out.println("original: -" + original + "-");
		System.out.println("toLowerCase: -" + s1 + "-");
		System.out.println("toUpperCase: -" + s2 + "-");
		System.out.println("Trim: -" + s3 + "-");
		System.out.println("substring(2): -" + s4 + "-");
		System.out.println("sunstring(2, 9): -" + s5 + "-");
		System.out.println("replace('a' , 'x'): -" + s6 + "-");
		System.out.println("replace('abc', 'xy'): -" + s7 + "-");
		System.out.println("indexOf('bc'): -" + i + "-");
		System.out.println("lastIndexOf('bc'): -" + j + "-");
		
		
		
		sc.close();
	}

}
