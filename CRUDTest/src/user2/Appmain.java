package user2;

import java.util.List;
import java.util.Scanner;

/**
 * 날짜 : 2025/01/27
 * 이름 : 김준서
 * 내용 : Java CRUD 실습하기
 */



public class Appmain {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------");
		System.out.println("User1 CRUD 실습");
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		
		
		User1Dao dao = User1Dao.getInstance();
		
		while(true) {
			System.out.println("0:종료, 1:입력, 2:조회, 3:검색, 4:수정, 5:삭제");
			System.out.print("선택 >");
			
			int answer = sc.nextInt();
			
			switch (answer) {
			case 0:
				isRunning = false;
				break;
				
				
			case 1:
				User1 user = inputUser(sc);
				dao.insertUser1(user);
				System.out.println("Insert 완료...");
				
				break;
				
			case 2:
				List<User1>user1List = dao.selectUser1List();
				for(User1 user1 : user1List) {
					System.out.println(user1);
				}
				
				
				break;
				
			case 3:
				
				String uid = findUser(sc);
				
				User1 user1 = dao.selectUser1(uid);
				
				if(user1 != null) {
					System.out.println(user1);
				}else {
					System.out.println("해당 아이디를 찾을 수 없습니다.");
				}
	
	
				break;
				
			case 4:
				User1 modifiedUser = modifyUser(sc);
				dao.updateUser1(modifiedUser);
				System.out.println("해당 사용자를 수정했습니다.");
	
	
				break;
			case 5:
				
				String removeUid = removeUser(sc);
				
				dao.deleteUser1(removeUid);
				System.out.println("해당 사용자를 삭제했습니다.");
				
				
				break;
			
			}
			System.out.println("프로그램 종료...");
		}
	}
	
	
	public static User1 inputUser(Scanner sc) {
		sc.nextLine();
		
		System.out.println("아이디 입력 : ");
		String uid = sc.nextLine();
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.println("휴대폰 입력 : ");
		String hp = sc.nextLine();
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		
		User1 user = new User1(uid, name, hp, age);
		
		return user;
	}
	
	public static String findUser(Scanner sc) {
		
		sc.nextLine();
		
		System.out.println("검색 아이디 입력 : ");
		String uid = sc.nextLine();
		
		return uid;
	}
	
	
	public static User1 modifyUser(Scanner sc) {
		
		sc.nextLine();
		
		System.out.println("아이디 입력 : ");
		String uid = sc.nextLine();
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		
		System.out.println("휴대폰 입력 : ");
		String hp = sc.nextLine();
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		
User1 user = new User1(uid, name, hp, age);
		
		return user;
	}
	
	
public static String removeUser(Scanner sc) {
		
		sc.nextLine();
		
		System.out.print("삭제할 아이디 입력 : ");
		String uid = sc.nextLine();
		
		return uid;
	}
	
	
}
















