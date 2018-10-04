import java.util.Arrays;
import java.util.Scanner;

public class Equalpair {
	

	public void Numberpair(int[] a) {
		// TODO Auto-generated method stub
		int l = a.length;
		Arrays.sort(a);
		int count = 0;
		int temp = a[0];
		for(int i=1;i<l;i++)
		{
			if(a[i]==temp)
			{
				count++;
			}
			temp = a[i];
			
		}
		System.out.println("No.of equal numbers in the given array are: "+count);
		
		
	}

}
