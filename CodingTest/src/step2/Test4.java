package step2;

import java.util.Scanner;

public class Test4 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("");
	        int x = scanner.nextInt();

	        System.out.print("");
	        int y = scanner.nextInt();

	        // 사분면 판단
	        if (x > 0 && y > 0) {
	            System.out.println("1");
	        } else if (x < 0 && y > 0) {
	            System.out.println("2");
	        } else if (x < 0 && y < 0) {
	            System.out.println("3");
	        } else if (x > 0 && y < 0) {
	            System.out.println("4");
	        }

	        scanner.close();
	    }

}
