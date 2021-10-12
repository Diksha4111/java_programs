package java_constructors;

/*public class Main {
	int age;
	public Main()
	{
		age = 19;
	}
	
	public static void main(String[] args) {
		Main myobj = new Main();
		System.out.println("Age = "+ myobj.age);
	}
}*/

//Constructor is called when object of the class is created. 
//Constructor in java is a special method that is used to initialize objects.
//A constructor must not have a return type. Constructor name must match with the class name.
//It can be used to set initial values for object attributes.
//It can take multiple parameters.
//All classes have constructors by default.If you do not create any class constructor then Java itself creates one for you,then you are not allowed to set the initial values of the object attributes.
//With the use of constructors we are allowing different objects to have different values. By using constructors we can set different values of object attributes for different objects.

public class Main{
	int age;
	String name;
	public Main(int x,String y) {
		age=x;
		name=y;
	}
	public static void main(String[] args) {
		Main obj1 = new Main(10,"Anjali");
		Main obj2 = new Main(40,"Mohan");
		System.out.println("For obj1 age is = "+ obj1.age+"\nFor obj1 name is = "+obj1.name+"\n");
		System.out.println("For obj2 age is = "+ obj2.age+"\nFor obj2 name is = "+obj2.name+"\n");
	}
}