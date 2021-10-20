package Buoi8.Model.Enum;

public enum PhongHoc {
	A101(1), A102(2), A103(3), A104(4);
	public final int label;
	
	private PhongHoc(int label) {
		this.label = label;
	}
	
	public static PhongHoc getPhongHoc(int label) {
		for(PhongHoc i : values()) {
			if(i.label == label) 
				return i;
		}
		return null;
	}
}
