package Buoi8.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Buoi8.Controller.Utils.ScannerUtils;
import Buoi8.Controller.singleton.BangLichDay;
import Buoi8.Controller.singleton.BangLichHoc;
import Buoi8.Controller.singleton.BangLichTruc;
import Buoi8.Controller.singleton.DanhSachGiangVien;
import Buoi8.Controller.singleton.DanhSachNhanVien;
import Buoi8.Controller.singleton.DanhSachSinhVien;
import Buoi8.Model.entity.GiangVien;
import Buoi8.Model.entity.LichDay;
import Buoi8.Model.entity.LichHoc;
import Buoi8.Model.entity.LichTruc;
import Buoi8.Model.entity.NhanVien;
import Buoi8.Model.entity.SinhVien;

public class Output {
	static Scanner input = new Scanner(System.in);

	public static void inThongTin() {
		System.out.println("1. Thông tin giảng viên");
		System.out.println("2. Thông tin sinh viên");
		System.out.println("3. Thông tin nhân viên");
		int c = ScannerUtils.readInt(input, 1, 3);
		if (c == 1) {
			System.out.println("Nhập id: ");
			int id = ScannerUtils.readInt(input);
			if (DanhSachGiangVien.isValid(id)) {
				for (GiangVien i : DanhSachGiangVien.getInstance()) {
					if (i.getId() == id) {
						System.out.println(i.getId() + "" + i.getTen() + " " + i.getTuoi() + " " + i.getGioitinh() + " "
								+ i.getChucvu());
						break;
					}
				}
				for (LichDay i : BangLichDay.getInstance()) {
					if (i.getId() == id) {
						System.out.println(i.getPhong() + " " + i.getTime());
						break;
					}
				}
			} else {
				System.out.println("Không tồn tại id này");
			}
		} else if (c == 2) {
			System.out.println("Nhập id: ");
			int id = ScannerUtils.readInt(input);
			if (DanhSachSinhVien.isValid(id)) {
				for (SinhVien i : DanhSachSinhVien.getInstance()) {
					if (i.getId() == id) {
						System.out.println(i.getId() + "" + i.getTen() + " " + i.getTuoi() + " " + i.getGioitinh() + " "
								+ i.getChucvu());
						break;
					}
				}
				for (LichHoc i : BangLichHoc.getInstance()) {
					if (i.getId() == id) {
						System.out.println(i.getPhong() + " " + i.getTime());
						break;
					}
				}
			} else {
				System.out.println("Không tồn tại id này");
			}
		} else {
			System.out.println("Nhập id: ");
			int id = ScannerUtils.readInt(input);
			if (DanhSachNhanVien.isValid(id)) {
				for (NhanVien i : DanhSachNhanVien.getInstance()) {
					if (i.getId() == id) {
						System.out.println(i.getId() + "" + i.getTen() + " " + i.getTuoi() + " " + i.getGioitinh() + " "
								+ i.getChucvu());
						break;
					}
				}
				for (LichTruc i : BangLichTruc.getInstance()) {
					if (i.getId() == id) {
						System.out.println(i.getVitri() + " " + i.getTime());
						break;
					}
				}
			} else {
				System.out.println("Không tồn tại id này");
			}
		}
	}

	public static void inLich() {
		System.out.println("1. Bảng Lịch dạy");
		System.out.println("2. Bảng Lịch học");
		System.out.println("3. Bảng Lịch trực");
		int c = ScannerUtils.readInt(input, 1, 3);
		if(c == 1){
			for(LichDay i : BangLichDay.getInstance()) {
				System.out.println(i.getId() + " " + i.getPhong() + " " + i.getTime());
			}
		}
		else if(c == 2) {
			for(LichHoc i : BangLichHoc.getInstance()) {
				System.out.println(i.getId() + " " + i.getPhong() + " " + i.getTime());
			}
		}
		else{
			for(LichTruc i : BangLichTruc.getInstance()) {
				System.out.println(i.getId() + " " + i.getTime() + " " + i.getVitri());
			}
		}
	}
}