package Buoi8.Controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi8.Model.entity.GiangVien;

public class DanhSachGiangVien {
	static private List<GiangVien> danhSachGiangVien = new ArrayList<GiangVien>();

	private DanhSachGiangVien() {
	}

	public static List<GiangVien> getInstance() {
		return danhSachGiangVien;
	}

	static public boolean addGiangVien(GiangVien giangVien) {
		danhSachGiangVien.add(giangVien);
		return true;
	}

	static public boolean isValid(int id) {
		for (GiangVien i : danhSachGiangVien) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public GiangVien getGiangVien(int id) {
		for (GiangVien i : danhSachGiangVien) {
			if (i.getId() == id) {
				return i;
			}
		}
		return null;
	}
}
