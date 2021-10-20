package Buoi8.Model.Enum;

public enum Time {
	_7h_8h(1), _8h_9h(2), _9h_10h(3);
	
	public final int tiet;
	
	private Time(int tiet) {
		this.tiet = tiet;
	}
	
	public static Time getTime(int tiet) {
		for(Time i : values()) {
			if(i.tiet == tiet) {
				return i;
			}
		}
		return null;
	}
}
