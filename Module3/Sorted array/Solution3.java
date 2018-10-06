import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args)
	{
		int n,m,o = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array1");
		n = sc.nextInt();
		System.out.println("Enter the size of array2");
		m = sc.nextInt();
		int a1[] = new int[n];
		int a2[] = new int[m];
		int b[] = new int[n+m];
		System.out.println("Enter the elements in to the array1");
		for(int i=0;i<n;i++)
		{
			a1[i] = sc.nextInt();
		}
		System.out.println("Enter the elements in to the array2");
		for(int j=0;j<m;j++)
		{
			a2[j] = sc.nextInt();
		}
		Sortedarray sa = new Sortedarray();
		sa.Arraysort(a1,a2,b);
	}

}
