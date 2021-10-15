package Buoi7.singleton;

import java.util.ArrayList;
import java.util.List;
import Buoi7.entity.*;

public class DanhSachNhanVien {
	static private List<NhanVien> danhSachNhanVien = new ArrayList<NhanVien>();

	private DanhSachNhanVien() {
	}

	public static List<NhanVien> getInstance() {
		return danhSachNhanVien;
	}

	static public boolean addNhanVien(NhanVien nhanVien) {
		danhSachNhanVien.add(nhanVien);
		return true;
	}

	static public boolean isValid(int id) {
		for (NhanVien i : danhSachNhanVien) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public NhanVien getNhanVien(int id) {
		for (NhanVien i : danhSachNhanVien) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
