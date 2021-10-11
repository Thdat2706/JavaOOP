package abs_QuanLiSach.entity;

public class VanHoc extends Book {
	private int numberOfPublication;
	private String category;
	
	public VanHoc(String author, double price, int quantity, String category, int numberOfPublication) {
		super(author, price, quantity);
		this.numberOfPublication = numberOfPublication;
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNumberOfPublication() {
		return numberOfPublication;
	}

	public void setNumberOfPublication(int numberOfPublication) {
		this.numberOfPublication = numberOfPublication;
	}

}
