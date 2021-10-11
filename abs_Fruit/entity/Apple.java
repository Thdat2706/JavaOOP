package abs_Fruit.entity;

public class Apple extends Fruit{
	private double sugar;
	private String vitamin;
	
	public Apple(String name, double price, int quantity, String vitamin, double sugar) {
		super(name, price, quantity);
		this.sugar = sugar;
		this.vitamin = vitamin;
	}
	
	public String getVitamin() {
		return vitamin;
	}

	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
}
