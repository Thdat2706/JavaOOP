package Buoi8.Model.Enum;

public enum Type {
	CHINHQUY(1), LIENTHONG(2) , TAICHUC(3);
	public final int loai;
	
	private Type(int loai) {
		this.loai = loai;
	}
		
	public static Type getType(int loai) {
		for(Type i : values()) {
			if(i.loai == loai) {
				return i;
			}
		}
		return null;
	}
}
