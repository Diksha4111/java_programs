package shapes;

public class Square extends Shape{
	public Square(double side) {
		this.side= side;
	}
	private double side;
	public double getside() {
		return side;
	}
	public void setside(double newside) {
		this.side= newside;
	}
	
	public double getArea() {
		return side*side;
	}
}
