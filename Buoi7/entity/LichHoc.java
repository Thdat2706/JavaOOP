package Buoi7.entity;

import Buoi7.Enum.PhongHoc;
import Buoi7.Enum.Time;

public class LichHoc extends LichLamViec {
	private PhongHoc phong;
	private int id;
	public static int count;

	public LichHoc(Time time, PhongHoc phong) {
		super(time);
		this.id = ++count;
		this.phong = phong;
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
