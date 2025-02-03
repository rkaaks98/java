package controller;


import java.util.Scanner;

import entity.Customer;
import service.CustomerService;

public class CustomerController {
	
	
	//서비스 객체
	
	private CustomerService service = CustomerService.getInstance();
	
	public Customer manage(Scanner sc) {
		
		//로그인 Customer 객체
		
		Customer loginedCustomer = null;
		
		while(true) {
			
			System.out.println("---------- 회원관리 ----------");
			
			if (loginedCustomer==null) {
				System.out.println("0:메인, 1:회원가입, 2:로그인, 3:회원목록");
			}else {
				System.out.println("0:메인, 1:나의정보, 2:로그아웃, 3:회원목록");
			}
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				// 메인 이동
				return loginedCustomer;
			case 1:
				
				if(loginedCustomer == null) {
					//회원가입
					Customer inputCustomer = inputCustomer(sc);
					service.registerCustomer(inputCustomer);
				}else {
						//나의정보
						System.out.println(loginedCustomer);
				}
				
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
	}

	private Customer inputCustomer(Scanner sc) {
		sc.nextLine();
		System.out.print("아이디 : ");
		String custId = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("휴대폰 : ");
		String hp = sc.nextLine();
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		
		
		return new Customer(custId, name, hp, addr);
	}
	
	
}
















