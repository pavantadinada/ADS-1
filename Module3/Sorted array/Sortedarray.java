import java.util.Arrays;
import java.util.Scanner;

public class Sortedarray {
	public void Arraysort(int[] a1,int[] a2,int[] b)
	{
		Arrays.sort(a1);
		Arrays.sort(a2);
		Scanner sc = new Scanner(System.in);
		int N = a1.length;
		int M = a2.length;
		int K = b.length;
		int i=0,j=0,k=0;
		while(i<N)
		{
			b[k]=a1[i];
			i++;
			k++;
		}
		while(j<M)
		{
			b[k]=a2[j];
			j++;
			k++;
		}
		Arrays.sort(b);
		System.out.println("Common elements in both the arrays in sorted order");
		for(int y=0;y<K-1;y++)
		{
			if(b[y]==b[y+1])
			{
				System.out.print(b[y]+" ");
			}
		}
		/*int k=0;
		if(M>N)
		{
			for(int j=0;j<M+N;j++)
			{
				for(int i=0;j<M+N;i++)
				{
					if(a1[i]==a2[j])
					{
						b[k]=a1[i];
						k++;
					}
				}
				
			}
		}
		else
		{
			for(int i=0;i<M+N;i++)
			{
				for(int j=0;j<M+N;j++)
				{
					if(a1[i]==a2[j])
					{
						b[k]=a1[i];
						k++;
					}
				}
				
			}
		}
		
		
		Arrays.sort(b);
		System.out.println("Common elements in both the arrays in sorted order");
		for(int y=0;y<K-1;y++)
		{
			if(b[y]==b[y+1])
			{
				System.out.print(b[y]+" ");
			}
		
	    }*/
	}
	

}
