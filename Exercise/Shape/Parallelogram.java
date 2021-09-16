package Exercise.Shape;

public class Parallelogram extends Shape {
	private static int numberOfsides = 4;
	
    public Parallelogram() {
    	super(Parallelogram.numberOfsides);
    }
    
    public double getChuvi(){
        return (getHeight() + getWidth())*2;
    }
    
}
