package Buoi8.Controller.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi8.Model.Enum.PhongHoc;
import Buoi8.Model.Enum.Time;
import Buoi8.Model.Enum.ViTri;
import Buoi8.Model.entity.LichHoc;
import Buoi8.Model.entity.LichTruc;

public class BangLichTruc {
	static private List<LichTruc> bangLichTruc = new ArrayList<LichTruc>();

	private BangLichTruc() {
	}

	public static List<LichTruc> getInstance() {
		return bangLichTruc;
	}

	static public boolean addLichTruc(LichTruc lich) {
		if (BangLichTruc.isTrungLich(lich.getTime().tiet, lich.getVitri().vitri)) {
			return false;
		}
		bangLichTruc.add(lich);
		return true;
	}

	static public boolean isTrungLich(int tg, int vitri) {
		for (LichTruc i : bangLichTruc) {
			if (i.getTime() == Time.getTime(tg) && i.getVitri() == ViTri.getViTri(vitri)) {
				return true;
			}
		}
		return false;
	}

	static public boolean isValid(int id) {
		for (LichTruc i : bangLichTruc) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public LichTruc getLichTruc(int id) {
		for (LichTruc i : bangLichTruc) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
