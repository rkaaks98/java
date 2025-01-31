package controller;

import java.util.Scanner;

import entity.Customer;
import service.CustomerService;
import service.OrderService;

public class OrderController {
	
	private OrderService service = OrderService.getInstance();
	
	public void manage(Scanner sc, Customer loginedCustomer) {
		
		while(true) {
			System.out.println("--------- 주문관리 ----------");
			System.out.println("0:메인, 1:주문하기, 2:주문목록, 3:나의주문");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			
			switch(choice) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
				
			}
		}
		
	
	}
}
