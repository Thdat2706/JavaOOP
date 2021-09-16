package Exercise.School;

public class Security extends Human {
	private double salary;
	
	public Security(String name, int age, String CCCD, double salary) {
		super(name,age,CCCD);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
