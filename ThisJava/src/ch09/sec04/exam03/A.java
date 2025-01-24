package ch09.sec04.exam03;

public class A {
	
	//메소드
	
	public void method1 (int arg) {
		//로컬 변수
		int var = 1;
		
		//로컬 클래스
		
		class B {
			//메소드
			
			void method2 () {
				
				//로컬 변수 읽기
				
				System.out.println("arg : " + arg);
				System.out.println("var : " + var );
			}
		}
		
		B b = new B();
		
		b.method2();
	}

}
