package ch04.sec05;

/*
 * 김준서 교재 132
 */

public class SumFrom1 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}

}
