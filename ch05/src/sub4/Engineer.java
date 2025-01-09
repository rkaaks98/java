package sub4;

public class Engineer extends Person {

	private String specialty;

	public Engineer(String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;
		
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 엔지니어이며 "+specialty+"전공 입니다.");
	}

}