package abs_QuanLiSach.entity;

abstract public class Book {
	private int id;
	private String author;
	private double price;
	private int quantity;
	static public int count;

	/**
	 * @param id
	 * @param author
	 * @param price
	 * @param quantity
	 * @param category
	 */
	public Book(String author, double price, int quantity) {
		super();
		this.id = ++count;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	abstract public String getCategory();

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
