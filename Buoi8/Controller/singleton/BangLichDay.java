package Buoi8.Controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi8.Model.Enum.PhongHoc;
import Buoi8.Model.Enum.Time;
import Buoi8.Model.entity.LichDay;

public class BangLichDay {
	static private List<LichDay> bangLichDay = new ArrayList<LichDay>();

	private BangLichDay() {
	}

	public static List<LichDay> getInstance() {
		return bangLichDay;
	}

	static public boolean addLichDay(LichDay lich) {
		if (BangLichDay.isTrungLich(lich.getTime().tiet, lich.getPhong().label)) {
			return false;
		}
		bangLichDay.add(lich);
		return true;
	}

	static public boolean isTrungLich(int tiet, int phong) {
		for (LichDay i : bangLichDay) {
			if (i.getTime() == Time.getTime(tiet) && i.getPhong() == PhongHoc.getPhongHoc(phong)) {
				return true;
			}
		}
		return false;
	}

	static public boolean isValid(int id) {
		for (LichDay i : bangLichDay) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public LichDay getLichDay(int id) {
		for (LichDay i : bangLichDay) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
