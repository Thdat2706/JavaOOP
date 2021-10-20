package Buoi8.Controller.Utils;

import java.util.Scanner;

public class ScannerUtils {

	public static int readInt(Scanner scanner) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Bạn nhập phải phải là 1 số");
				System.out.println("Mời bạn nhập lại");
			}
		}
	}

	public static int readInt(Scanner input, int min, int max) {
		while (true) {
			try {
				int a = Integer.parseInt(input.nextLine());
				if (a < min || a > max) {
					System.out.println("Bạn phải nhập 1 số >= " + min + " và <= " + max);
					System.out.println("Mời bạn nhập lại: ");
				} else
					return a;
			} catch (NumberFormatException ex) {
				System.out.println("Bạn nhập phải phải là 1 số");
				System.out.println("Mời bạn nhập lại");
			}
		}
	}

	public static String readString(Scanner input) {
		while (true) {
			try {
				while (true) {
					String s = input.nextLine();
					int kt = 1;
					for (int i = 0; i < s.length(); i++) {
						if ((s.charAt(i) - 0 >= 97 && s.charAt(i) - 0 <= 122)
								|| (s.charAt(i) - 0 >= 65 && s.charAt(i) - 0 <= 90) || s.charAt(i) - 0 == 32)
							continue;
						else {
							System.out.println("Tên không được chứa ký tự đặc biệt!");
							System.out.println("Mời bạn nhập lại: ");
							kt = 0;
							break;
						}
					}
					if (kt == 1 && s != null)
						return s;
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				System.out.println("Mời bạn nhập lại: ");
			}
		}
	}
}
