package Buoi8.Model.entity;

import Buoi8.Model.Enum.PhongHoc;
import Buoi8.Model.Enum.Time;

public class LichDay extends LichLamViec {
	private int id;
	public static int count;
	private PhongHoc phong;

	public LichDay(int id, Time time, PhongHoc phong) {
		super(time);
		this.phong = phong;
		this.id = id;
	}

	public PhongHoc getPhong() {
		return phong;
	}

	public void setPhong(PhongHoc phong) {
		this.phong = phong;
	}

	public int getId() {
		return id;
	}
}
