package QuanLiSach.entity;

public class KhoaHoc extends Book{
	private int publishYear;

	/**
	 * @param author
	 * @param price
	 * @param quantity
	 * @param category
	 * @param publishYear
	 */
	public KhoaHoc(String author, double price, int quantity, String category, int publishYear) {
		super(author, price, quantity, category);
		this.publishYear = publishYear;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
}
