package nl.kolvoort.ds;

public class Rectangle extends Shape implements Stretchable {

	private double length;
	private double width;
	
	public Rectangle(double len, double wid){
		length = len;
		width = wid;
	}
	
	public double area(){
		return length * width;
	}
	
	public double perimeter(){
		return 2 * (length + width);
	}
	
	public String toString(){
		return "Rectangle: " + length + " " + width;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getWidth(){
		return width;
	}

	@Override
	public void stretch(double factor) {
		if (factor <= 0)
			throw new IllegalArgumentException();
		
		if (length > width){
			length *= factor;
		}
		else{
			width *= factor;
		}
		
	}
}
