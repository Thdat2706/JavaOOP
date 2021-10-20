package Buoi8.Model.entity;

import Buoi8.Model.Enum.Time;
import Buoi8.Model.Enum.ViTri;

public class LichTruc extends LichLamViec {
	private ViTri vitri;
	private int id;
	public static int count;

	public LichTruc(int id, Time time, ViTri vitri) {
		super(time);
		this.vitri = vitri;
		this.id = id;
	}

	public ViTri getVitri() {
		return vitri;
	}

	public void setVitri(ViTri vitri) {
		this.vitri = vitri;
	}

	public int getId() {
		return id;
	}
}
