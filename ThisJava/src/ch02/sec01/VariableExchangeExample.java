package ch02.sec01;

/*
 * 교재 40 실습하기
 */
public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ",y:" + y);
		
		int temp = x;
		x = y;
		y = x;
		System.out.println("x:" + x + ",y:" +y);
	}

}
