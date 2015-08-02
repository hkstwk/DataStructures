package nl.kolvoort.ds;

public class Rectangle extends Shape {

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
}
