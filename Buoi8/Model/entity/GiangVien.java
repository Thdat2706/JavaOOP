package Buoi8.Model.entity;

import java.util.ArrayList;

import Buoi8.Controller.singleton.BangLichDay;
import Buoi8.Model.Enum.ChucVu;
import Buoi8.Model.Enum.GioiTinh;

public class GiangVien extends Info {
	private int id;

	public static int count;
	public static ChucVu chucvu = ChucVu.GIAOVIEN;

	public GiangVien(String ten, int tuoi, GioiTinh gioitinh) {
		super(ten, tuoi, gioitinh);
		this.id = ++count;
	}

	public static ChucVu getChucvu() {
		return chucvu;
	}

	public static void setChucvu(ChucVu chucvu) {
		GiangVien.chucvu = chucvu;
	}

	public int getId() {
		return id;
	}
}
