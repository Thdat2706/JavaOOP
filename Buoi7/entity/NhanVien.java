package Buoi7.entity;

import Buoi7.Enum.ChucVu;
import Buoi7.Enum.GioiTinh;

public class NhanVien extends Information {
	private int id;
	public static int count;

	public NhanVien(String ten, int tuoi, GioiTinh gioitinh, ChucVu chucvu) {
		super(ten, tuoi, gioitinh, chucvu);
		this.id = ++count;
	}

	public int getId() {
		return id;
	}

}
