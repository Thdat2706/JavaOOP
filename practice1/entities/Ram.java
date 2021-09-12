package com.NITC.practice1.entities;

public class Ram {
	private int id;
    public int getId() {
		return id;
	}

	private String name;
    private Hang hang;
    
    /**
     * @param name
     * @param hang
     */
    public Ram(String name, Hang hang,int id ) {
        this.name = name;
        this.hang = hang;
    }

    public String getName() {
        return name;
    }

    public Hang getHang() {
        return hang;
    }

	
}