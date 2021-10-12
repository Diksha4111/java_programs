package java_interfaces;

interface Food {
	public void smell();
	public void taste();
}

class Sweetdish implements Food{
	public void smell() {
		System.out.println("\'Sweet smell\'");
	}
	public void taste() {
		System.out.println("\'Awsome taste\'");
	}
}

class Main{
	public static void main(String[] args) {
		Sweetdish sweetobj = new Sweetdish();
		sweetobj.smell();
		sweetobj.taste();
	}
}

//Interfaces are also used to achieve abstraction i.e. to ensure security by proving only certain details to the user and hiding the unnecessary ones.
//Like abstraction we are not allowed to to make objects of the interfaces to access them. We can access interfaces in the same we did in case of abstraction.
//The body of interface methods are not provided in the interfaces itself but in the implemented sub-class.
// " Interface methods are by default abstract and public ".
// " Interface attributes are by default public,static and final ".
//Interfaces can't have constructors because we can't make objects of the interfaces.

//Java doesn't allow multiple inheritance but it allows multiple interface implementation.

/*interface One{
	public void sayhello();
}
interface Two{
	public void sayhi();
}
class Greetings implements One,Two{
	public void sayhello() {
		System.out.println(" Hello\n");
	}
	public void sayhi() {
		System.out.println(" Hi\n");
	}
}
class Main{
	public static void main(String[] args) {
		Greetings myobj = new Greetings();
		myobj.sayhello();
		myobj.sayhi();
	}
}*/
