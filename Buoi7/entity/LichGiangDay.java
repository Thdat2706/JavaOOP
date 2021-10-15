package Buoi7.entity;

import Buoi7.Enum.PhongHoc;
import Buoi7.Enum.Time;

public class LichGiangDay extends LichLamViec {
	private int id;
	public static int count;
	private PhongHoc phong;

	public LichGiangDay(Time time, PhongHoc phong) {
		super(time);
		this.phong = phong;
		this.id = ++count;
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
