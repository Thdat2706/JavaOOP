package example.entity;

public class Fruit {
	private int id;
	private String name;
	private double price;
	private int quantity;
	private String vitamin;
	private static int count = 0;
	
	public Fruit (String name, double price, int quantity, String vitamin) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.vitamin = vitamin;
		this.id = ++count;
	}

	public String getVitamin() {
		return vitamin;
	}

	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
