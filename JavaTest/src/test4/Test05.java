package test4;

/*
 * 날짜 : 2025/01/17
 * 이름 : 김준서
 * 내용 : 자바 API 클래스 연습문제
 */

class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	@Override
	public String toString() {
        return "Apple [Country=" + country + ", Price=" + price + "]";
    }	
}


class Banana {
	
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	@Override
	public String toString() {
        return "Banana [Country=" + country + ", Price=" + price + "]";
    }	
}

class Grape {
	
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	@Override
	public String toString() {
        return "Grape [Country=" + country + ", Price=" + price + "]";
    }	
}




public class Test05 {
	
	public static void main(String[] args) {
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);
		
		showInfo(apple);
		showInfo(apple);
		showInfo(apple);
	}

	public static void showInfo(Object fruit) {
		
		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			System.out.println(apple);
			
		}else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			System.out.println(banana);
		
		}else if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			System.out.println(grape);
		}
		
	}

}














