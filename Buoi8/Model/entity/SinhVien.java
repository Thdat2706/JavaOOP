package Buoi8.Model.entity;

import java.util.ArrayList;

import Buoi8.Controller.singleton.BangLichHoc;
import Buoi8.Model.Enum.ChucVu;
import Buoi8.Model.Enum.GioiTinh;
import Buoi8.Model.Enum.Type;

public class SinhVien extends Info {
	private int id;
	private Type type;
	public static int count;
	public static ChucVu chucvu = ChucVu.SINHVIEN;

	public SinhVien(String ten, int tuoi, GioiTinh gioitinh, Type type) {
		super(ten, tuoi, gioitinh);
		this.type = type;
		this.id = ++count;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public static ChucVu getChucvu() {
		return chucvu;
	}

	public int getId() {
		return id;
	}

}
