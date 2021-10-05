package example.entity;

public class Apple extends Fruit{
	private double sugar;

	public Apple(String name, double price, int quantity, String vitamin, double sugar) {
		super(name, price, quantity,vitamin);
		this.sugar = sugar;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
}
