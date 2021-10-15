package Buoi7.Enum;

public enum GioiTinh {
	NAM(1), NU(0), KHAC(2);

	public final int label;

	private GioiTinh(int label) {
		this.label = label;
	}

	public static GioiTinh getGioiTinh(int label) {
		for (GioiTinh i : values()) {
			if (i.label == label)
				return i;
		}
		return null;
	}
}
