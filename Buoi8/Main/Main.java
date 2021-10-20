package Buoi8.Main;

import java.util.Scanner;

import Buoi8.Controller.Utils.ScannerUtils;
import Buoi8.View.ShowMenu;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			ShowMenu.ThongBao();
			System.out.println("1. Tiếp");
			System.out.println("2. Thoát");
			int c = ScannerUtils.readInt(input, 1, 2);
		}
	}

}
