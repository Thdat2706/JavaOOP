package Buoi8.Model.entity;

import java.util.ArrayList;

import Buoi8.Controller.singleton.BangLichTruc;
import Buoi8.Model.Enum.ChucVu;
import Buoi8.Model.Enum.GioiTinh;

public class NhanVien extends Info {
	private int id;
	public static int count;
	private ChucVu chucvu;
	
	public NhanVien(String ten, int tuoi, GioiTinh gioitinh, ChucVu chucvu) {
		super(ten, tuoi, gioitinh);
		this.id = ++count;
		this.chucvu = chucvu;
	}

	public ChucVu getChucvu() {
		return chucvu;
	}

	public void setChucvu(ChucVu chucvu) {
		this.chucvu = chucvu;
	}

	public int getId() {
		return id;
	}
}
