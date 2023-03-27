package exam08;

public class Person {
	private String name; // 이름
	private int age; // 나이
	private String email; // 메일
	private String department; // 학번

	public Person() {
	}

	public Person(String name, int age, String email, String department) {

		this.name = name;
		this.age = age;
		this.email = email;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void printInfo() {
		System.out.println("성명: " + this.getName());
		System.out.println("나이: " + this.getAge());
		System.out.println("이메일: " + this.getEmail());
		System.out.println("학과: " + this.getDepartment());
	}

}
