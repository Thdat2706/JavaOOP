package com.NITC.practice2.entities;

import java.util.Scanner;

public class Sach {
	private String name;
	private Author tacgia;
	private String trangthai;
	private int soluong;

	/**
	 * @param name
	 * @param tacgia
	 * @param trangthai
	 */
	public Sach() {
	}

	public Sach(String name, Author tacgia, String trangthai) {
		super();
		this.name = name;
		this.tacgia = tacgia;
		this.trangthai = trangthai;
	}

	public String getName() {
		return name;
	}

	public Author getTacgia() {
		return tacgia;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public int getSoluong() {
		return soluong;
	}

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("ten sach: ");
		this.name = input.nextLine();
		System.out.println("ten tac gia:");
		this.tacgia = new Author(input.nextLine());
		System.out.println("trang thai: ");
		this.trangthai = input.nextLine();
		System.out.println("nhap so luong: ");
		this.soluong = input.nextInt();
	}

	public void output() {
		System.out.println(this.getName() + " " + this.getTrangthai() + " " + this.getTacgia().getName() + " "
				+ this.getSoluong());
	}

}
