package Buoi8.Model.Enum;

public enum ViTri {
	CBV(4), TANG1(1), TANG2(2), TANG3(3);

	public final int vitri;

	private ViTri(int vitri) {
		this.vitri = vitri;
	}

	public static ViTri getViTri(int vitri) {
		for (ViTri i : values()) {
			if (i.vitri == vitri)
				return i;
		}
		return null;
	}
}
