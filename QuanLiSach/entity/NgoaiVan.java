package QuanLiSach.entity;

public class NgoaiVan extends Book{
	private String isbn;

	/**
	 * @param author
	 * @param price
	 * @param quantity
	 * @param category
	 * @param isbn
	 */
	public NgoaiVan(String author, double price, int quantity, String category, String isbn) {
		super(author, price, quantity, category);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
