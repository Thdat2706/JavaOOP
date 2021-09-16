package Exercise.School;

public class Human {
	private String name;
	private int age;
	private String CCCD;
	
	public Human(String name, int age, String CCCD) {
		this.name = name;
		this.age = age;
		this.CCCD = CCCD;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCCCD() {
		return CCCD;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}
	
	
}
