package QuanLiSach.Main;

import QuanLiSach.entity.*;
import QuanLiSach.singleton.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Inventory.getInstance();
		Inventory.addBook(new VanHoc("Tố Hữu", 100, 5, "Thơ", 10));
		Inventory.addBook(new KhoaHoc("A", 50, 1, "Tự nhiên", 2018));
		Inventory.addBook(new KhoaHoc("B", 70, 7, "Toán Học", 2019));
		Inventory.addBook(new NgoaiVan("C", 50, 15, "Anh", "ISBN 0-306-40615-3"));
		Inventory.addBook(new NgoaiVan("D", 30, 10, "Đức", "ISBN 0-306-40615-2"));

		while (true) {
			System.out.println("1. Quan li kho");
			System.out.println("2. Khach hang");
			System.out.println("Ban la:");
			int c = input.nextInt();
			if (c == 1) {
				while (true) {
					System.out.println("Moi ban nhap id loai sach muon them so luong: ");
					int id = input.nextInt();
					System.out.println("Moi ban nhap so luong: ");
					int quantity = input.nextInt();
					Inventory.addQuantity(id, quantity);
					System.out.println("Ban muon them so luong loai sach nao khac khong");
					System.out.println("1. Co");
					System.out.println("2. Khong");
					c = input.nextInt();
					if (c == 2) {
						break;
					}

				}
			} else {
				System.out.println("1. Xem danh sach kho");
				System.out.println("2. Them sach vao cart");
				System.out.println("3. Xuat thanh tien");
				c = input.nextInt();
				if (c == 1) {
					for (Book i : Inventory.getInstance()) {
						System.out.println(i.getId() + "	" + i.getAuthor() + "    " + i.getPrice() + "    " + "    "
								+ i.getQuantity() + "    " + i.getCategory());
					}
				} else if (c == 2) {
					Cart.getInstance();
					for (Book i : Inventory.getInstance()) {
						System.out.println(i.getId() + "	" + i.getAuthor() + "    " + i.getPrice() + "    " + "    "
								+ i.getQuantity() + "    " + i.getCategory());
					}
					while (true) {
						System.out.println("Moi ban nhap id sach muon mua: ");
						int id = input.nextInt();
						System.out.println("Moi ban nhap so luong muon mua: ");
						int quantity = input.nextInt();
						if (Cart.addToCart(id, quantity)) {
							System.out.println("Them vao cart thanh cong");
						} else {
							System.out.println("Them vao cart khong thanh cong");
						}
						System.out.println("Ban muon them gi vao cart nua khong:");
						System.out.println("1. Co");
						System.out.println("2. Khong");
						c = input.nextInt();
						if (c == 2) {
							break;
						}
					}
				} else if (c == 3) {
					System.out.println("Thanh tien: " + Cart.intoMoney());
				}
			}
		}
	}

}
