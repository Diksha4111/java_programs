package shapes;

public class Shape{
	private String name;
	String sides;
	public String getname() {
		return name;
	}
	public void setname(String shapename) {
		this.name = shapename;
	}
	
	public void shapeProperty(String sides) {
		System.out.println("\'I have "+sides+" sides\'");
	}
	public double getArea() {
		return 0;
	}
}
