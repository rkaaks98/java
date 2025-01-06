package step2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println(" ");
		
		if (a >=90 && a <=100) {
			System.out.println("A");
		}else if (a >=80 && a <=89) {
			System.out.println("B");
	    }else if (a >=70 && a <=79) {
			System.out.println("C");
	    }else if (a >=60 && a <=69) {
			System.out.println("D");
	    }else if (a >=0 && a < 60) {
			System.out.println("F");
	    }else {
	    	System.out.println("");
	    }

}
