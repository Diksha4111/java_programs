package java_encapsulation;

import java.util.Scanner;
class Person
{
	private String Name;
	
	public String getName()
	{
		return Name;
	}
	public void setName(String newName)
	{
		this.Name= newName;
	}
}
public class Main
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Name : ");
		String x=input.nextLine();
		input.close();
		Person myobj = new Person();
		myobj.setName(x);
		System.out.println("\nYour name is: "+myobj.getName());
		System.out.println("\n\n\"This is an example of encapsulation!!\"");
	}
}

//Encapsulation means that we are hiding sensitive data from the user. We achieve this by setting those attributes of any class as private.
//In order to access these private information (from other classes) we use getter and setter method.
//This improves the security of the information present in every class.
//This increases the flexibility as the user can change one part of the program without affecting the other.
//get method makes the class attributes read-only.
//set method makes the class attributes write only.
