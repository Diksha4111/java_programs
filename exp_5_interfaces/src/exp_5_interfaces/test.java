package exp_5_interfaces;

import java.util.Scanner;

public interface test 
{
	public int square();
}

class arithmetic implements test
{
	int c;
	arithmetic(int x)
	{
		 c=x;
	}
	public int square()
	{
		return(c*c);
	}
}

class ToTestInt
{
	public int getsquare(int a) 
	{
		arithmetic obj = new arithmetic(a); 
		return obj.square();
	}
}

class Finaloutput
{
	//Scanner input = new Scanner(System.in);
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number:"+"\t");
		int c= input.nextInt();
		input.close();
		ToTestInt output = new ToTestInt();
		System.out.println("The square of "+c+" is "+output.getsquare(c));
	}
}