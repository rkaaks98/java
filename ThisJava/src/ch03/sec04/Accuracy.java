package ch03.sec04;


/*
 * 김준서 교재 87
 */
public class Accuracy {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		
	}

}
