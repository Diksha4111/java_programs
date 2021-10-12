package polymorphism;

class Shape
{	
	public double getPerimeter()
	{
		return 0;
	}
}

class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double getPerimeter()
	{
		return(2*3.14*radius);
	}
}

class Square extends Shape
{
	double side;
	Square(double side)
	{
		this.side=side;
	}
	
	public double getPerimeter()
	{
		return(4*side);
	}
}

class Triangle extends Shape
{
	double side1,side2,side3;
	Triangle(double side1,double side2,double side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public double getPerimeter()
	{
		return(side1+side2+side3);
	}
}

class Output
{
	public static void main(String args[])
	{
		Shape myshape  = new Shape();
		System.out.println("Perimeter of the shape is: "+myshape.getPerimeter()+"\n");
		
		myshape= new Circle(4);
		System.out.println("Perimeter of the circle is: "+myshape.getPerimeter()+"\n");
		
		myshape = new Square(4);
		System.out.println("Perimeter of the square is: "+myshape.getPerimeter()+"\n");
		
		myshape = new Triangle(2,3,4);
		System.out.println("Perimeter of the triangle is: "+myshape.getPerimeter()+"\n");
	}
}