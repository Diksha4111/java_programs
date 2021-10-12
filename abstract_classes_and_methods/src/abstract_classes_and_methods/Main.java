package abstract_classes_and_methods;

abstract class Main {
	String name="Diksha";
	public abstract void eat();
}
class Me extends Main{
	public void eat() {
		System.out.println("I'm a vegetarian!");
	}
}
class Output{
	public static void main(String[] args) {
		Me obj = new Me();
		System.out.println("My name is "+obj.name);
		obj.eat();
	}
}

//Abstract is a non-access modifier.
//Abstract can be used only within an abstract class.
//Abstract can only be classes and methods.
//Abstract methods doesn't contain any body in the abstract class. The body of abstract methods are made in another class which is inherited from the abstract class.
//We are not allowed to create the object of the abstract class in order to access it but we can access the abstract class by making the object of another class which is inherited from the existing abstract class.
//We can achieve abstraction by interfaces also.  