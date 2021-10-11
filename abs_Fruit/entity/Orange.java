package abs_Fruit.entity;


public class Orange extends Fruit{
	private double weight;
	private String vitamin;

	public Orange(String name, double price, int quantity, String vitamin, double weight) {
		super(name, price, quantity);
		this.weight = weight;
		this.vitamin = vitamin;
	}

	public String getVitamin() {
		return vitamin;
	}

	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
