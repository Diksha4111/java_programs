package first_18_9_21;
//import java.uitl.Scanner

/*public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter :");
		String x = input.nextLine();
		input.close();
		System.out.println(x);
		System.out.println("Hello diksha");
	}
}*/

//static:- it indicates that the particular member belongs to a type itself rather than any instance of that type, which means only one instance of that static member is created and shared among all the instances of the class.
//static:- Any static member can be accessed before any of the objects of that class are created, and without reference to any object.
//static can be variable, method, block, nested class.

//static variable:- can be used to refer to the common property of all objects.For example company name for employees, college name for students etc. 
//static variables are memory efficient(save the memory).

//static method:- any static method belongs to a class rather than its object. 
//To invoke any static method we don't need to create any instance of a class.We can call static methods directly.
//A static method can access any static data member and can change its value.
//A static method can't access non-static data member or call non-static method directly.

//Difference between static and non-static method---->
/*public class Main{
	public static void method(){
		System.out.println("Hello");
	}
	public void method2()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		method();
		Main myobj = new Main();
		myobj.method2();
	}
}*/
