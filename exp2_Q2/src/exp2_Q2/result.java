package exp2_Q2;

import java.util.Scanner;

public class result {

	public static void main(String[] args) 
	{
		
		int marks[] = new int[10];
		int temp;
		String grade;
		
		//taking input from the user
		Scanner input = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter marks of sub. no."+(i+1)+":\t");
			marks[i]=input.nextInt();
		}
		input.close();
		
		//sorting the array
		for(int i=0;i<marks.length;i++)
		{
			for(int j=i+1;j<marks.length;j++)
			{
				if(marks[i]>marks[j])
				{
					temp=marks[j];
					marks[j]=marks[i];
					marks[i]=temp;
				}
			}
		}
		
		//calculation of the result
		System.out.println("\nResult is:\n");
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>=75)
			{
				grade="DISTINCTION";
			}
			else if(marks[i]>=50 && marks[i]<75)
			{
				grade="MERIT";
			}
			else
			{
				grade="FAIL";
			}
			System.out.println(marks[i]+" "+grade);
		}
	}

}
