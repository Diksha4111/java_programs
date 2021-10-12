package combinations;

public class even_combinations {

	public static void main(String[] args) {
		 
		int a[]=new int[] {3,4,5,6,7};
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				for(int k=0;k<5;k++)
				{
					for(int m=0;m<5;m++)
					{
						for(int n=0;n<5;n++)
						{
							System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+a[m]+" "+a[n]);
							/*if(a[n]%2==0)
							{
								System.out.println(a[i]+""+a[j]+""+a[k]+""+a[m]+""+a[n]);
							}*/
						}
					}
				}
			}
		}

	}

}
