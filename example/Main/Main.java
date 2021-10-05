package example.Main;

import example.entity.*;
import example.singleton.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Inventory.getInstance();
		Inventory.addFruit(new Apple("Táo Mỹ", 100, 5, "C, K,Mn, Cu,..", 20));
		Inventory.addFruit(new Apple("Táo Tàu", 50, 1, "C, K,Mn, Cu,..", 10));
		Inventory.addFruit(new Orange("Cam sành", 70, 7, "C, B6, B12,..", 20));
		Inventory.addFruit(new Banana("Chuối Mỹ", 50, 15, "B6, C,..", 0.01));
		Inventory.addFruit(new Banana("Táo Tàu", 30, 10, "B6, C,..", 10));

		while (true) {
			System.out.println("1. Quan li kho");
			System.out.println("2. Khach hang");
			System.out.println("Ban la:");
			int c = input.nextInt();
			if (c == 1) {
				while (true) {
					System.out.println("Moi ban nhap id loai qua muon them so luong: ");
					int id = input.nextInt();
					System.out.println("Moi ban nhap so luong: ");
					int quantity = input.nextInt();
					Inventory.addQuantity(id, quantity);
					System.out.println("Ban muon them so luong loai qua nao khac khong");
					System.out.println("1. Co");
					System.out.println("2. Khong");
					c = input.nextInt();
					if (c == 2) {
						break;
					}

				}
			} else {
				System.out.println("1. Xem danh sach kho");
				System.out.println("2. Them hang vao cart");
				c = input.nextInt();
				if (c == 1) {
					for (Fruit i : Inventory.getInstance()) {
						System.out.println(i.getId() + "	" + i.getName() + "    " + i.getPrice() + "    "
								+ i.getQuantity() + "    " + i.getVitamin());
					}
				}
				if(c == 2) {
					Cart.getInstance();
					for (Fruit i : Inventory.getInstance()) {
						System.out.println(i.getId() + "	" + i.getName() + "    " + i.getPrice() + "    "
								+ i.getQuantity() + "    " + i.getVitamin());
					}
					while(true) {
						System.out.println("Moi ban nhap id loai qua muon mua: ");
						int id = input.nextInt();
						System.out.println("Moi ban nhap so luong muon mua: ");
						int quantity = input.nextInt();
						if (Cart.addToCart(id, quantity)) {
							System.out.println("Them vao cart thanh cong");
						}
						else {
							System.out.println("Them vao cart khong thanh cong");
						}
						System.out.println("Ban muon them gi vao cart nua khong:");
						System.out.println("1. Co");
						System.out.println("2. Khong");
						c = input.nextInt();
						if(c == 2) {
							break;
						}
					}
				}
			}
		}
	}

}
