package Exercise.Shape;

public class Triangle extends Shape { 
	public static int numberOfsides = 3;

	public Triangle() {
		super(Triangle.numberOfsides);
	}
	
    public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }

}  