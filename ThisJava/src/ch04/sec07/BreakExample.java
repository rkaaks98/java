package ch04.sec07;

/*
 * 김준서 교재 136p
 */

public class BreakExample {
	
	public static void main(String[] args) {
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
