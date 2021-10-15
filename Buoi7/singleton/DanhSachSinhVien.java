package Buoi7.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7.entity.*;

public class DanhSachSinhVien {
	static private List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();

	private DanhSachSinhVien() {
	}

	public static List<SinhVien> getInstance() {
		return danhSachSinhVien;
	}

	static public boolean addSinhVien(SinhVien sinhVien) {
		danhSachSinhVien.add(sinhVien);
		return true;
	}

	static public boolean isValid(int id) {
		for (SinhVien i : danhSachSinhVien) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public SinhVien getSinhVien(int id) {
		for (SinhVien i : danhSachSinhVien) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
