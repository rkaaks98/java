package ch07.sec04.exam01;

public class Computer extends Calculator {

	@Override
	public double areaCricle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	//메소드 오버라이딩

}
