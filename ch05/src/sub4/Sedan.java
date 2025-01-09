package sub4;

public class Sedan extends Car{
	
	
	private int cc;

	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	public void turbo() {
		//부모클래스 속성 speed 접근권한을 protected로 변경
	
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량명 : " + this.color);
		System.out.println("차량명 : " + this.cc);
		System.out.println("차량명 : " + this.speed);
	}

	

}
