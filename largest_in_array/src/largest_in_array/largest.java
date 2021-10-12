package largest_in_array;

public class largest {

	public static void main(String[] args) {
		
		int a[]= new int[] {2,7,4,0,1};
		int max= a[0],i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Largest element in the array is:"+max);

	}

}
