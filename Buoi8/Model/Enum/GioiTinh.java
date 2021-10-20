package Buoi8.Model.Enum;

public enum GioiTinh {
	NAM(0), NU(1), KHAC(2);

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
