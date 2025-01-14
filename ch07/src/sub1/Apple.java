package sub1;

/*
 * 날짜 : 2025/01/14
 * 이름 : 김준서
 * 내용 : Java Object 클래스 실습하기
 */

public class Apple { // 암묵적으로Object 클래스를 상속
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;		
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}

	
	
	
}

