package Buoi7.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7.Enum.*;
import Buoi7.entity.*;

public class BangLichTruc {
	static private List<LichTrucNhanVien> bangLichTruc = new ArrayList<LichTrucNhanVien>();

	private BangLichTruc() {
	}

	public static List<LichTrucNhanVien> getInstance() {
		return bangLichTruc;
	}

	static public boolean addLichTruc(LichTrucNhanVien lich) {
		bangLichTruc.add(lich);
		return true;
	}

	static public boolean isValid(int tg, int vitri) {
		for (LichTrucNhanVien i : bangLichTruc) {
			if (i.getTime() == Time.getTime(tg) && i.getVitri() == ViTri.getViTri(vitri)) {
				return true;
			}
		}
		return false;
	}

	static public LichTrucNhanVien getLichTruc(int id) {
		for (LichTrucNhanVien i : bangLichTruc) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
