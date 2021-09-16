package Exercise.School;

public class Teacher extends Human {
	private Subject subject;
	
	public Teacher(String name, int age, String CCCD, Subject subject) {
		super(name,age,CCCD);
		this.subject = subject;
	}
	
	public Subject getSubject() {
		return subject;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
}
