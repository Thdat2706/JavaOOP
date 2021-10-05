package QuanLiSach.entity;

public class VanHoc extends Book {
	private int numberOfPublication;
	
	public VanHoc(String author, double price, int quantity, String category, int numberOfPublication) {
		super(author, price, quantity, category);
		this.numberOfPublication = numberOfPublication;
	}

	public int getNumberOfPublication() {
		return numberOfPublication;
	}

	public void setNumberOfPublication(int numberOfPublication) {
		this.numberOfPublication = numberOfPublication;
	}

}
