package example.entity;

public class Orange extends Fruit{
	private double weight;

	public Orange(String name, double price, int quantity, String vitamin, double weight) {
		super(name, price, quantity,vitamin);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
