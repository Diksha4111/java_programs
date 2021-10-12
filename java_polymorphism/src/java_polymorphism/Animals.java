package java_polymorphism;

class Animals {
	public void Sound()
	{
		System.out.println("Animals make sound!");
	}
}
 class Cat extends Animals{
	 public void Sound()
	 {
		 System.out.println("\"Cat says-- meow meow\"");
	 }
 }
 class Dog extends Animals{
	 public void Sound() {
		 System.out.println("\"Dog says-- woof woof\"");
	 }
 }
 class Main{
	 public static void main(String[] args) {
		 Animals obj = new Animals();
		 Animals objcat = new Cat();
		 Animals objdog = new Dog();
		 obj.Sound();
		 objcat.Sound();
		 objdog.Sound();
	 }
 }
 
 //Polymorphism means "many forms". The same method can have different implementation in different classes(sub-classes basically). 
 //We achieve this by inheritance.
 //It increases code re-usability.
