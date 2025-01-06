package step2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.print("");
		
		if (a >=90 && a <=100) {
			System.out.print("A");
		}else if (a >=80 && a <=89) {
			System.out.print("B");
	    }else if (a >=70 && a <=79) {
			System.out.print("C");
	    }else if (a >=60 && a <=69) {
			System.out.print("D");
	    }else if (a >=0 && a < 60) {
			System.out.print("F");
	    }else {
	    	System.out.print("");
	    }
	}
}
