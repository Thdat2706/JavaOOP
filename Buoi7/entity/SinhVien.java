package Buoi7.entity;

import Buoi7.Enum.*;

public class SinhVien extends Information {
	private int id;
	private Type type;
	public static int count;

	public SinhVien(String ten, int tuoi, GioiTinh gioitinh, ChucVu chucvu, Type type) {
		super(ten, tuoi, gioitinh, chucvu);
		this.type = type;
		this.id = ++count;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

}
