package step1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("");
		int num1 = sc.nextInt();
		System.out.print("");
		int num2 = sc.nextInt();
		
		int a = num2 % 10;
		int b = (num2 / 10) % 10;
		int c = num2 / 100;
		
		int q = num1 * a;
		int w = num1 * b;
		int e = num1 * c;
		
		int total = num1 * num2;
		
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		System.out.println(total);
		
	}

}
