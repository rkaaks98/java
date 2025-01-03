package test1;

/*
 * 날짜 : 2025/01/03
 * 이름 : 김준서
 * 내용
*/
public class Test08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0 ; i<n ; i++) {
			
			for(int j=n-1 ; j>1 ; j--) {
				System.out.print(" ");
			}
			
			for(int j=0 ; j<2*i+1 ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
