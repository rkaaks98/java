package ch04.sec08;

/*
 * 김준서 교재 139p
 */

public class Continue {
	public static void main(String[] args) throws Exception {
		for(int i=1; 1<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
