package sum;

public class sum_of_all_integers {

	public static void main(String[] args) {
		int sum=0;
		for(int i=90;i<200;i++)
		{
			if(i%7==0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);

	}

}
