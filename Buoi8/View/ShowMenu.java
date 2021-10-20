package Buoi8.View;

import java.util.Scanner;

import Buoi8.Controller.Utils.ScannerUtils;

public class ShowMenu {

	static Scanner input = new Scanner(System.in);

	public static void ThongBao() {
		System.out.println("1. Thêm thông tin");
		System.out.println("2. Thêm lịch làm việc");
		System.out.println("3. In thông tin");
		System.out.println("4. In lịch làm việc");
		System.out.println("Chon: ");

		int c = ScannerUtils.readInt(input, 1, 4);
		if (c == 1) {
			Input.nhapThongTin();
		} else if (c == 2) {
			Input.addLich();
		} else if (c == 3) {
			Output.inThongTin();
		}
		else {
			Output.inLich();
		}
	}
}
