package test4ex;

import java.util.Scanner;

class NotFoundException extends Exception {
	public NotFoundException() {
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}

public class test02 {
	
	public static void main(String[] args) {
		
		int [] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
		try {
			searchArray(find, arr);
			System.out.println("해당하는 숫자 찾음!!!");
			
		}catch(NotFoundException e) {
			System.out.println("숫자가 아닙니다. 숫자를 입력하세요.");
			
		}finally {
			sc.close();
		}
		System.out.println("프로그램 정상 종료...");
	}
	
	public static void searchArray(int find, int[] arr) throws NotFoundException {
		
		for(int i : arr) {
			if (i == find) {
				return;
			}
		}
		throw new NotFoundException();
		
	}

}
