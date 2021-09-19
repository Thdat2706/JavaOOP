package Polimorphism;

public class Banana extends Fruit{
	private double kali40;
	
	public Banana(double kali40, String name, double price, double quantity) {
		super(name,price,quantity);
		this.kali40= kali40;
	}

	public double getKali40() {
		return kali40;
	}
	

}
