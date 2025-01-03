package ch04.sec04;

/*
 * 김준서 교재 128
 */

public class SumFrom {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			sum += i;
			
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}

}
