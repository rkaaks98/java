package sub3;

//싱글톤 객체
public class Calc {
	//싱글톤
	private static Calc instance = new Calc();   //싱글톤 객체 이름 = instance
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {}
	//싱글톤
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}

}
