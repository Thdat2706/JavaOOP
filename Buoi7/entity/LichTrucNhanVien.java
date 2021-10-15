package Buoi7.entity;

import Buoi7.Enum.Time;
import Buoi7.Enum.ViTri;

public class LichTrucNhanVien extends LichLamViec {
	private ViTri vitri;
	private int id;
	public static int count;

	public LichTrucNhanVien(Time time, ViTri vitri) {
		super(time);
		this.id = ++count;
		this.vitri = vitri;
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
