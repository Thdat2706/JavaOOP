package Buoi7.Enum;

public enum PhongHoc {
	A101(1), A201(2), A301(3), A401(4);
	public final int label;
	
	private PhongHoc(int label) {
		this.label = label;
	}
	
	public static PhongHoc getPhongHoc(int label) {
		for(PhongHoc i : values()) {
			if(i.label == label) return i;
		}
		return null;
	}
}
