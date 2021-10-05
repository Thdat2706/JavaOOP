package QuanLiSach.entity;

public class Book {
	private int id;
	private String author;
	private double price;
	private int quantity;
	private String category;
	static public int count;

	/**
	 * @param id
	 * @param author
	 * @param price
	 * @param quantity
	 * @param category
	 */
	public Book(String author, double price, int quantity, String category) {
		super();
		this.id = ++count;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
