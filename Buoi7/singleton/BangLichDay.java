package Buoi7.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7.Enum.*;
import Buoi7.entity.*;

public class BangLichDay {
	static private List<LichGiangDay> bangLichDay = new ArrayList<LichGiangDay>();

	private BangLichDay() {
	}

	public static List<LichGiangDay> getInstance() {
		return bangLichDay;
	}

	static public boolean addLichDay(LichGiangDay lich) {
		bangLichDay.add(lich);
		return true;
	}

	static public boolean isValid(int tg, int phong) {
		for (LichGiangDay i : bangLichDay) {
			if (i.getTime() == Time.getTime(tg) && i.getPhong() == PhongHoc.getPhongHoc(phong)) {
				return true;
			}
		}
		return false;
	}

	static public LichGiangDay getLichDay(int id) {
		for (LichGiangDay i : bangLichDay) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
