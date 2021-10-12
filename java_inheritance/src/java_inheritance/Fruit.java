package java_inheritance;

class Mango {
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String newname)
	{
		this.name=newname;
	}
	public void taste(){
		System.out.println("\"I'm sweet!\"");
	}
}
class Alphanzo extends Mango
{
	public void me() {
		System.out.println("\"Hi! I'm Alphanzo\"");
	}
	public static void main(String[] args) {
		Alphanzo obj = new Alphanzo();
		obj.me();
		obj.setName("Mango");
		System.out.println("\"I belong to "+obj.getName()+" family\"");
		obj.taste();
	}
}