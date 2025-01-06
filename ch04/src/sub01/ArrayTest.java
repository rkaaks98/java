package sub01;

/*
 * 김준서
 * 2024.01.06
 * Java 배열 실습하기
 * 
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 배열
		int[] arr1 = {1,2,3,4,5};
		char[] arr2 = {'A','B','C'};
		String[] arr3 = {"서울","대전","대구","부산","광주",};
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		
		
		// 배열값 참조
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		
		System.out.println("arr2[1] : " + arr2[1]); // B 출력
		System.out.println("arr3[1] : " + arr3[1]); // 대전 출력
		System.out.println("arr3[3] : " + arr3[3]); // 부산 출력
		System.out.println("arr3[4] : " + arr3[4]); // 광주 출력
		
		
		
		
		//배열의 길이
		
		System.out.println("arr1 길이 : " + arr1.length);
		System.out.println("arr2 길이 : " + arr2.length);
		System.out.println("arr3 길이 : " + arr3.length);
		
		
		
		
		//배열의 반복문
		
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(char c : arr2) { // 배열의 길이만큼 반복하면서 배열원소를 변수 c에 대입
			System.out.print(c + " ");
			
		}
		System.out.println();
		
		for(String d : arr3) {
			System.out.print(d + " ");
		}
				
		
		
		
		// 1차원 배열
		
		int[] scores = {80,60,78,62,92}; // 배열이름은 복수형태 s를 붙여서 네이밍
		int total = 0;
		
		for(int score : scores) {
			total +=score;
			
		}
		System.out.println("scores 합 : " + total);
		
		
		
		
		
		// 2차원 배열
		
		
		
		
		
		// 3차원 배열
		
		
		
		
		
		
		
	}

}