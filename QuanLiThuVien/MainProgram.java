package QuanLiThuVien;

import com.NITC.practice2.entities.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Sach> lst_Sach = new ArrayList<Sach>();
		while (true) {
			Sach Book = new Sach();
			Book.input();
			lst_Sach.add(Book);
			System.out.println("Ban muon nhap thong tin sach tiep k:");
			System.out.println("1. Co");
			System.out.println("2. khong");
			if (input.nextInt() == 1) {
				continue;
			} else {
				break;
			}
		}

		for (int i = 0; i < lst_Sach.size(); i++) {
			lst_Sach.get(i).output();
		}
	}
}
