package Exercise.School;

public class Student extends Human {
	private int grade;

	public Student(String name, int age, String CCCD, int grade) {
		super(name,age,CCCD);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
