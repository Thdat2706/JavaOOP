package Buoi8.Model.entity;

import Buoi8.Model.Enum.ChucVu;
import Buoi8.Model.Enum.GioiTinh;

abstract public class Info {
	private String ten;
	private int tuoi;
	private GioiTinh gioitinh;

	public Info(String ten, int tuoi, GioiTinh gioitinh) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
	}

	public String getTen() {
		return ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public GioiTinh getGioitinh() {
		return gioitinh;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public void setGioitinh(GioiTinh gioitinh) {
		this.gioitinh = gioitinh;
	}
}
