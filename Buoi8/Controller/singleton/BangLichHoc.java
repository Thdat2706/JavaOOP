package Buoi8.Controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi8.Model.Enum.PhongHoc;
import Buoi8.Model.Enum.Time;
import Buoi8.Model.entity.LichHoc;

public class BangLichHoc {
	static private List<LichHoc> bangLichHoc = new ArrayList<LichHoc>();

	private BangLichHoc() {
	}

	public static List<LichHoc> getInstance() {
		return bangLichHoc;
	}

	static public boolean addLichHoc(LichHoc lich) {
		if(BangLichHoc.isTrungLich(lich.getTime().tiet, lich.getPhong().label)) {
			return false;
		}
		bangLichHoc.add(lich);
		return true;
	}

	static public boolean isTrungLich(int tiet, int phong) {
		for (LichHoc i : bangLichHoc) {
			if (i.getTime() == Time.getTime(tiet) && i.getPhong() == PhongHoc.getPhongHoc(phong)) {
				return true;
			}
		}
		return false;
	}

	static public boolean isValid(int id) {
		for (LichHoc i : bangLichHoc) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public LichHoc getLichHoc(int id) {
		for (LichHoc i : bangLichHoc) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
