package test6.sub05;

public class Subject {
	
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject (String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student student) {
		students[studentCount ++] = student;
	}
	public void printSubjectInfo() {
		
	}
	
	public String getSubName() {
		return subName;
	}
	

}
