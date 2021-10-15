package Buoi7.Main;

import java.util.Scanner;
import Buoi7.entity.*;
import Buoi7.Enum.*;
import Buoi7.singleton.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DanhSachSinhVien.addSinhVien(new SinhVien("A", 20, GioiTinh.NAM, ChucVu.SINHVIEN, Type.CHINHQUY));
		DanhSachSinhVien.addSinhVien(new SinhVien("A", 20, GioiTinh.NAM, ChucVu.SINHVIEN, Type.TAICHUC));
		DanhSachSinhVien.addSinhVien(new SinhVien("A", 20, GioiTinh.NAM, ChucVu.SINHVIEN, Type.CHINHQUY));

		DanhSachNhanVien.addNhanVien(new NhanVien("A", 25, GioiTinh.NAM, ChucVu.BAOVE));
		DanhSachNhanVien.addNhanVien(new NhanVien("A", 25, GioiTinh.NAM, ChucVu.VESINH));
		DanhSachNhanVien.addNhanVien(new NhanVien("A", 25, GioiTinh.NAM, ChucVu.BAOVE));

		DanhSachGiangVien.addGiangVien(new GiangVien("A", 25, GioiTinh.NU, ChucVu.GIAOVIEN));
		DanhSachGiangVien.addGiangVien(new GiangVien("A", 25, GioiTinh.NU, ChucVu.GIAOVIEN));
		DanhSachGiangVien.addGiangVien(new GiangVien("A", 25, GioiTinh.NU, ChucVu.GIAOVIEN));

		BangLichDay.addLichDay(new LichGiangDay(Time._7h_8h, PhongHoc.A201));
		BangLichDay.addLichDay(new LichGiangDay(Time._8h_9h, PhongHoc.A101));
		BangLichDay.addLichDay(new LichGiangDay(Time._9h_10h, PhongHoc.A401));

		BangLichHoc.addLichHoc(new LichHoc(Time._8h_9h, PhongHoc.A201));
		BangLichHoc.addLichHoc(new LichHoc(Time._7h_8h, PhongHoc.A101));
		BangLichHoc.addLichHoc(new LichHoc(Time._9h_10h, PhongHoc.A301));

		BangLichTruc.addLichTruc(new LichTrucNhanVien(Time._8h_9h, ViTri.TANG1));
		BangLichTruc.addLichTruc(new LichTrucNhanVien(Time._8h_9h, ViTri.TANG2));
		BangLichTruc.addLichTruc(new LichTrucNhanVien(Time._8h_9h, ViTri.TANG3));

		while (true) {
			System.out.println("1.In danh sach sinh vien");
			System.out.println("2. In danh sach giang vien");
			System.out.println("3. In danh sach nhan vien");
			System.out.println("4.In bang lich hoc");
			System.out.println("5. In bang lich truc");
			System.out.println("6. In bang lich day");
			int c = input.nextInt();
			if (c == 1) {
				for (SinhVien i : DanhSachSinhVien.getInstance()) {
					System.out.println(i.getId() + " " + i.getTen() + " " + i.getTuoi() + " " + i.getGioitinh() + " "
							+ i.getChucvu());
				}
			}
			else if (c == 2) {
				for (GiangVien i : DanhSachGiangVien.getInstance()) {
					System.out.println(i.getId() + " " + i.getTen() + " " + i.getTuoi() + " " + i.getGioitinh() + " "
							+ i.getChucvu());
				}
			}
			else if (c == 3) {
				for (NhanVien i : DanhSachNhanVien.getInstance()) {
					System.out.println(i.getId() + " " + i.getTen() + " " + i.getTuoi() + " " + i.getGioitinh() + " "
							+ i.getChucvu());
				}
			}
			else if (c == 4) {
				for (LichHoc i : BangLichHoc.getInstance()) {
					System.out.println(i.getId() + " " + i.getTime() + " " + i.getPhong());
				}
			}
			else if (c == 5) {
				for (LichTrucNhanVien i : BangLichTruc.getInstance()) {
					System.out.println(i.getId() + " " + i.getTime() + " " + i.getVitri());
				}
			}
			else if (c == 6) {
				for (LichGiangDay i : BangLichDay.getInstance()) {
					System.out.println(i.getId() + " " + i.getTime() + " " + i.getPhong());
				}
			}
		}
	}
}
