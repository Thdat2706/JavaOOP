package com.NITC.practice1.entities;

public class Laptop {
    CPU cpu;
    Ram ram;
    Mainbroad mainbroad;
    Hang hang;
    int soLuong;
    
    /**
     * @param cpu
     * @param ram
     * @param mainbroad
     * @param hang
     */

    public CPU getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Mainbroad getMainbroad() {
        return mainbroad;
    }

    public Hang getHang() {
        return hang;
    }

    public int getSoLuong() {
        return soLuong;
    }
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	public void setMainbroad(Mainbroad mainbroad) {
		this.mainbroad = mainbroad;
	}
	public void setHang(Hang hang) {
		this.hang = hang;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
}