package interfaces_and_abstraction;

interface Shapeproperties {
	public float area(float x);
	public void shapename();
}

abstract class Shape implements Shapeproperties{
	abstract public float area(float x) ;
	abstract public void shapename() ;
}

class Circle extends Shape{
	private float radius;
	
	public float getSide() {
		return radius;
	}
	public void setradius(float newradius) {
		this.radius = newradius;
	}
	
	public float area(float radius) {
		return (float)(3.14*radius*radius);
	}
	public void shapename() {
		System.out.println("\'I'm a circle\'");
	}
}

class Square extends Shape{
	private int side;
	public int gerside() {
		return side;
	}
	public void setside(int newside) {
		this.side = newside;
	}
	
	public float area(float side) {
		return (float)side*side;
	}
	public void shapename() {
		System.out.println("\n\'I'm a square\'");
	}
}

class Main{
	public static void main(String[] args) {
		Circle circleobj = new Circle();
		Square squareobj = new Square();
		float Areacircle= circleobj.area(5.0f);
		circleobj.shapename();
		System.out.println("Area of circle = "+Areacircle);
		float Areasquare = squareobj.area(5.0f);
		squareobj.shapename();
		System.out.println("Area of square = "+Areasquare);
	}
}