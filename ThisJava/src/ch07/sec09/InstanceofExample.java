package ch07.sec09;

public class InstanceofExample {
	
	//main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	
	private static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		//person이 참조하는 책체가 Student 타입인지 확인

	}

}
