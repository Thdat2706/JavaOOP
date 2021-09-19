package Polimorphism;

public class Apple extends Fruit {
	private double amountOfSugar;

	public Apple(double amountOfSugar, String name, double price, double quantity) {
		super(name, price, quantity);
		this.amountOfSugar = amountOfSugar;

	}

	public double getAmountOfSugar() {
		return amountOfSugar;
	}

	public void setAmountOfSugar(double amountOfSugar) {
		this.amountOfSugar = amountOfSugar;
	}

}
