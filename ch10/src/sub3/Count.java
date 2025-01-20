package sub3;

public class Count {
	
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	
	//스레드 간의 경합(Race Condition)을 해결하기 위해 상호배제(Mutext) 처리
	public synchronized void setNum() {
		
	//ct1,ct2,ct3 총 세개가 들어오나 서로 경쟁이 발생해서 출력값이 부정확함.	
		
		//synchronized 동기화 블럭으로 임계영역 설정(동기화 작업 처리.)
		
		
		num++;
	}

}
