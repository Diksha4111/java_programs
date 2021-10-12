package shapes;

public class Circle extends Shape {
	private double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newradius) {
		this.radius = newradius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}
