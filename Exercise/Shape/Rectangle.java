package Exercise.Shape;

public class Rectangle extends Shape{
	static int numberOfsides = 4;
	
    Rectangle () {
    	super(Rectangle.numberOfsides);
    }

    public double getChuvi(){
        return (getHeight() + getWidth())*2;
    }
    
    
}