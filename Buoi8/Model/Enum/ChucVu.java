package Buoi8.Model.Enum;

public enum ChucVu {
GIAOVIEN(1), VESINH(2), BAOVE(3), SINHVIEN(4);
	
	public final int label;
		
	private ChucVu(int label) {
		this.label = label;
	}
		
	public static ChucVu getChucVu(int label) {
		for(ChucVu i : values()) {
			if(i.label == label) {
				return i;
			}
		}
		return null;
	}
}
