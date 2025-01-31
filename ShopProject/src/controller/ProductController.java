package controller;

import java.util.Scanner;

import service.ProductService;

public class ProductController {
	
	private ProductService service = ProductService.getInstance();
	
	public void manage(Scanner sc) {
		
		while(true) {
			System.out.println("---------- 상품관리 ----------");
			System.out.println("0:메인, 1:상품등록, 2:상품목록, 3:상품검색");
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 0:
				return;
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






