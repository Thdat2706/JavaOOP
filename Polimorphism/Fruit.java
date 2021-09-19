package Polimorphism;

public class Fruit {
	private String name;
	private double price;
	private double quantity;

	public Fruit(String name, double price,double quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void updateQuantity(int number) {
		this.quantity -= number;
	}

}
