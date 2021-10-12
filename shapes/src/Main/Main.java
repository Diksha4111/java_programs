package Main;
import shapes.*;

public class Main {
	public static void main(String[] args) {
		Shape myshape = new Shape();
		
		myshape= new Circle(10);
		myshape.setname("Circle");
		System.out.println("\'I'm a "+myshape.getname()+"\'");
		myshape.shapeProperty("infinite");
		System.out.println("Area of circle = "+myshape.getArea());
		
		myshape = new Square(4);
		myshape.setname("Square");
		System.out.println("\n\'I'm a "+myshape.getname()+"\'");
		myshape.shapeProperty("four");
		System.out.println("Area of square = "+myshape.getArea());
	}
}
