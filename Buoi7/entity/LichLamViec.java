package Buoi7.entity;

import Buoi7.Enum.Time;

abstract public class LichLamViec {

	private Time time;

	public LichLamViec(Time time) {
		super();
		this.time = time;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
