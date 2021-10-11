package abs_QuanLiSach.entity;

public class KhoaHoc extends Book{
	private int publishYear;
	private String category;

	public KhoaHoc(String author, double price, int quantity, String category, int publishYear) {
		super(author, price, quantity);
		this.publishYear = publishYear;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
}
