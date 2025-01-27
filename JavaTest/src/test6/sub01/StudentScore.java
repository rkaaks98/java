package test6.sub01;

public class StudentScore {
	
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	public void updateScore(double newScore) {
		if (newScore >= 0 && newScore <= 100) {
			this.score = newScore;
			System.out.println("점수 수정 완료");
		}else {
			System.out.println("잘못된 점수 입력");
		}
	}
	
	public double getScore() {
		return score;
	}
	public void printStudentInfo() {
		System.out.println("학생이름 : " + studentName);
		System.out.println("학생 ID : " + studentId);
		System.out.println("과목 : " + subject);
		System.out.println("점수 : " + score);
	}

}
