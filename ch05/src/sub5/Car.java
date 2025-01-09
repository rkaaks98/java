package sub5;
/*
 * 날짜 : 2025/01/07
 * 이름 : 김준서
 * 내용 : Java 클래스 실습하기
 * Car 클래스 정의 (설계)
 */

public class Car {
	
	
	//속성(멤버 변수) -  클래스 속성은 캡슐화를 위해 무조건 private 선언
	//protected 접근권한으로 자식클래스에서 참조 가능
	protected String name;
	protected String color;
	protected int speed;
	
	//생성자 - 캡슐화된 속성을 초기화하기 위한 클래스 이름과 동일한 반환 타입이 없는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
	}
	
	//기능(멤버 메서드) - 클래스 기능은 무조건 public 선언
	public void speedUp(int speed) {
		// 속성 speed에 매개변수값 대입,this는 현재 클래스를 지칭
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
	//Getter, Setter 정의(옵션) - 캡슐화된 속성을 수정하기 위한 메서드
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}