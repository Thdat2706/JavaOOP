package com.NITC.practice1.entities;

public class Mainbroad {
	private int id;
    private String name;
    private Hang hang;
    
    /**
     * @param name
     * @param hang
     */
    public Mainbroad(String name, Hang hang, int id) {
        this.name = name;
        this.hang = hang;
    }

    public int getId() {
		return id;
	}

	public String getName() {
        return name;
    }

    public Hang getHang() {
        return hang;
    }
}