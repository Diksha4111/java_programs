package exception_handling;

class MyCustomException extends Exception{
	public MyCustomException(String n) {
		super(n);
	}
}
class CheckException {
	void getException(int num) throws MyCustomException{
		if(num<500) {
			throw new MyCustomException("\nLess than 500");
		}
	}
	public static void main(String[] args) {
		CheckException newobj = new CheckException();
		try{
			newobj.getException(600);
		}
		catch(MyCustomException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("\nExecution is completed!");
		}
	}
}
