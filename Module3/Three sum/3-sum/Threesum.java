import java.util.Arrays;

public class Threesum {
	public void Arraysum(int[] a)
	{
		Arrays.sort(a);
		int count = 0;
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					int x=a[i];
					int y=a[j];
					int z=a[k];
					if(x+y+z==0)
					{
						count++;
					}
				}
			}
		}
		System.out.println("The count of three sum which is 0 in the given array is: "+count);
	}

}
