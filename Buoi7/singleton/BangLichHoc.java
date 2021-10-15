package Buoi7.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7.Enum.*;
import Buoi7.entity.*;

public class BangLichHoc {
	static private List<LichHoc> bangLichHoc = new ArrayList<LichHoc>();

	private BangLichHoc() {
	}

	public static List<LichHoc> getInstance() {
		return bangLichHoc;
	}

	static public boolean addLichHoc(LichHoc lich) {
		bangLichHoc.add(lich);
		return true;
	}

	static public boolean isTrungLich(int tg, int phong) {
		for (LichHoc i : bangLichHoc) {
			if (i.getTime() == Time.getTime(tg) && i.getPhong() == PhongHoc.getPhongHoc(phong)) {
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
