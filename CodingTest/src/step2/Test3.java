package step2;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int year = scanner.nextInt();

        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

        scanner.close();
    }

}
