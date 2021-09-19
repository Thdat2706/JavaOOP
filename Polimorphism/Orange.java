package Polimorphism;

public class Orange extends Fruit {
	private double weight;

	public Orange(double weight, String name, double price, double quantity) {
		super(name, price, quantity);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
}
