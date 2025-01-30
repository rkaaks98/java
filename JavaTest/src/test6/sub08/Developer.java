package test6.sub08;

public class Developer extends Employee {
	
	private String field;
	
	public Developer(String name, String birth, String employeeId, String dept, int salary, String field) {
		super(name, birth, employeeId, dept, salary);
		this.field = field;
	}
	
	public void changeField(String newField) {
		this.field = newField;
		System.out.println("개발 분야 변경 : " + newField);
	}
	
	public void printDeveloperInfo() {
		printEmployeeInfo();
		System.out.println("개발분야 : " + field);
	}

	

	

}
