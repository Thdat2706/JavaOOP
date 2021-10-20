package Buoi8.View;

import java.util.Scanner;

import Buoi8.Controller.Utils.ScannerUtils;
import Buoi8.Model.Enum.ChucVu;
import Buoi8.Model.Enum.GioiTinh;
import Buoi8.Model.Enum.PhongHoc;
import Buoi8.Model.Enum.Time;
import Buoi8.Model.Enum.Type;
import Buoi8.Model.Enum.ViTri;
import Buoi8.Model.entity.GiangVien;
import Buoi8.Model.entity.LichDay;
import Buoi8.Model.entity.LichHoc;
import Buoi8.Model.entity.LichTruc;
import Buoi8.Model.entity.NhanVien;
import Buoi8.Model.entity.SinhVien;
import Buoi8.Controller.singleton.*;

public class Input {
	static Scanner input = new Scanner(System.in);

	static public void nhapThongTin() {
		// Nhập info chung
		System.out.println("Tên: ");
		String name = ScannerUtils.readString(input);
		System.out.println("Tuổi: ");
		int age = ScannerUtils.readInt(input, 0, 60);
		System.out.println("Giới tính: Nam(0), Nữ(1), Khác(2)");
		GioiTinh gioiTinh = GioiTinh.getGioiTinh(ScannerUtils.readInt(input, 0, 2));
		System.out.println("Chức vụ: Giáo viên(1), Bảo vệ(2), Vệ sinh(3), Sinh viên(4)");
		ChucVu chucVu = ChucVu.getChucVu(ScannerUtils.readInt(input, 1, 4));

		// Thêm vào các danh sách sinh viên, giảng viên, nhân viên
		if (chucVu == ChucVu.GIAOVIEN) {
			DanhSachGiangVien.addGiangVien(new GiangVien(name, age, gioiTinh));
		} else if (chucVu == ChucVu.SINHVIEN) {
			System.out.println("Loại sinh viên: Chính quy(1), Liên thông(2), Tại chức(3))");
			Type type = Type.getType(ScannerUtils.readInt(input, 1, 3));
			DanhSachSinhVien.addSinhVien(new SinhVien(name, age, gioiTinh, type));
		} else {
			DanhSachNhanVien.addNhanVien(new NhanVien(name, age, gioiTinh, chucVu));
		}
	}

	public static void addLich() {
		// Nhập info lịch chung
		System.out.println("id của người có lịch: ");
		int id = ScannerUtils.readInt(input);
		System.out.println("Thời gian");
		System.out.println("_7h_8h(1), _8h_9h(2), _9h_10h(3)");
		Time time = Time.getTime(ScannerUtils.readInt(input, 1, 3));

		// Thêm lịch vào các bảng lịch dạy, học, trực
		System.out.println("Bạn muốn thêm vào bảng nào");
		System.out.println("1. Bảng lịch dạy");
		System.out.println("2. Bảng lịch học");
		System.out.println("3. Bảng lịch trục");
		int c = ScannerUtils.readInt(input, 1, 3);
		if (c == 1) {
			System.out.println("Phòng học: A101(1), A102(2), A103(3), A104(4)");
			PhongHoc phongHoc = PhongHoc.getPhongHoc(ScannerUtils.readInt(input, 1, 4));
			BangLichDay.addLichDay(new LichDay(id, time, phongHoc));
		} else if (c == 2) {
			System.out.println("Phòng học: A101(1), A102(2), A103(3), A104(4)");
			PhongHoc phongHoc = PhongHoc.getPhongHoc(ScannerUtils.readInt(input, 1, 4));
			BangLichHoc.addLichHoc(new LichHoc(id, time, phongHoc));
		} else {
			System.out.println("Vị trí: CBV(4), TANG1(1), TANG2(2), TANG3(3)");
			ViTri vitri = ViTri.getViTri(ScannerUtils.readInt(input, 1, 4));
			BangLichTruc.addLichTruc(new LichTruc(id, time, vitri));
		}
	}
}
