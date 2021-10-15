package Buoi7.entity;

import Buoi7.Enum.*;

abstract public class Information {
	private String ten;
	private int tuoi;
	private GioiTinh gioitinh;
	private ChucVu chucvu;

	/**
	 * @param ten
	 * @param tuoi
	 * @param gioitinh
	 */
	public Information(String ten, int tuoi, GioiTinh gioitinh, ChucVu chucvu) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.chucvu = chucvu;
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

	public ChucVu getChucvu() {
		return chucvu;
	}

	public void setChucvu(ChucVu chucvu) {
		this.chucvu = chucvu;
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
