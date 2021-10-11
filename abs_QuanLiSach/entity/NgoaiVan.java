package abs_QuanLiSach.entity;

public class NgoaiVan extends Book{
	private String isbn;
	private String category;
	/**
	 * @param author
	 * @param price
	 * @param quantity
	 * @param category
	 * @param isbn
	 */
	public NgoaiVan(String author, double price, int quantity, String category, String isbn) {
		super(author, price, quantity);
		this.isbn = isbn;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
