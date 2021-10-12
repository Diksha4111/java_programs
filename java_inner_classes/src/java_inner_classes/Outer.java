package java_inner_classes;

class Outer {
	int x=10;
	
	class Inner{
		int y=5;
	}
}

class Main{
	public static void main(String[] args) {
		Outer outerobj = new Outer();
		Outer.Inner innerobj = outerobj.new Inner(); 
		System.out.println(outerobj.x+innerobj.y);             //15 is the output.
	}
}

//If the inner class is private and if we try to access it from the outer class it will generate an error.

/*class Outer{
	int x=10;
	private class Inner{
		int y=5;
	}
}
class Main{
	public static void main(String[] args) {
		Outer outerobj = new Outer();
		Outer.Inner innerobj = outerobj.new Inner();
		System.out.println(outerobj.x+innerobj.y);             //Error is generated.
	}
}*/



//Static inner class. This means to access the static inner class from the outer class we don't have to create any object of the outer class. 

/*class Outer{
	int x=10;
	static class Inner{
		int y=5;
	}
}
class Main{
	public static void main(String[] args) {
		Outer outerobj = new Outer();                           //object of outer class is created to access outer class attribute.
		Outer.Inner innerobj = new Outer.Inner();               //object of inner class is created to access the inner class attribute, without using the outer class object as the inner is made static.
		System.out.println("Outer attribute---->"+outerobj.x);
		System.out.println("Inner attribute---->"+innerobj.y);
	}
}*/




//We can access outer class from inner class.

/*class Outer{
	int x=10;
	class Inner{
		public int innermethod() {
			return x;
		}
	}
}
class Main{
	public static void main(String[] args) {
		Outer outerobj = new Outer();
		Outer.Inner innerobj = outerobj.new Inner();
		System.out.println(innerobj.innermethod());
	}
}*/