package test1;

/*
 * 날짜 : 2025/01/03
 * 이름 : 김준서
 * 내용 : Java 연산자 연습문제 
 */

public class Test03 {
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		
		
		result = num++;
		System.out.println("result : " + result);
		
		result = ++num;
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}

}
