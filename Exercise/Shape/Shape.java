package Exercise.Shape;

public class Shape {
	private double height;  
    private double width;  
    private int numberOfsides;
    
    public Shape(int numberOfSides) {
    	this.numberOfsides = numberOfSides;
    }
    
    public double getArea(){
        return getHeight() * getWidth();
    }
    
    public int getNumberOfSides () {
    	return numberOfsides;
    }

    // Set height and width
    public void setValues(double height, double width) {
       this.height = height;
       this.width = width;
    }

    //Get height
    public double getHeight() {
        return height;
    }
      
    //Get width
    public double getWidth() {
        return width;
    }    
}