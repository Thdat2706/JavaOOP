package Buoi8.Model.entity;

import Buoi8.Model.Enum.Time;

public class LichLamViec {
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
