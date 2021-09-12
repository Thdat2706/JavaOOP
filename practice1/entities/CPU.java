package com.NITC.practice1.entities;

public class CPU {
	private String name;
	private Hang hang;
	private int id;

	/**
	 * @param name
	 * @param hang
	 */
	public CPU(String name, Hang hang, int id) {
		this.name = name;
		this.hang = hang;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Hang getHang() {
		return hang;
	}
}
