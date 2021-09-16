package Exercise.Shape;

public class Square extends Shape {
	private static int numberOfsides = 4;
	
	public Square() {
    	super(Square.numberOfsides);
    }
	
    public double getChuvi(){
        return (getHeight() + getWidth())*2;
    }
    
}
