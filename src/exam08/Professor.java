package exam08;

public class Professor extends Person {
	private String professorId; // 교번

	public Professor(String name, int age, String email, String department, String professorId) {
		super(name, age, email, department);
		this.professorId = professorId;
	}

	public String getProfessorId() {
		return professorId;
	}

	public void setProfessorId(String professorId) {
		this.professorId = professorId;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("학번: " + this.getProfessorId());
		System.out.println("학과: " + this.getDepartment());

	}

}
