package test1;

import java.util.Scanner;

/*
 * 날짜 : 2025/01/03
 * 이름 : 김준서
 * 내용 : Java 자료형 연습문제 
 */

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int     year;
		int     birth;
		String  name;
		
		System.out.print("올해 년도 입력 : ");
		year = sc. nextInt();
		
		System.out.print("태어난 년도 입력 : ");
		birth = sc. nextInt();
		sc. nextLine();
		
		System.out.print("이름 입력 : ");
		name = sc. nextLine();
		
		int age = year - birth;
		
		System.out.format("%s님 안녕하세요.\n당신은 올해 만 %d세 입니다.", name, age);
		
		sc.close();
		
		
				
				
	}

}
