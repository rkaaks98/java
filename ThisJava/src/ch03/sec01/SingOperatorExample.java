package ch03.sec01;

/*
 * 김준서 교재 80
 */

public class SingOperatorExample {
	
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x : " + x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y : " + y);
	}

}
