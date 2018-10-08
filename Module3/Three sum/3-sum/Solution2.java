import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter size of the array");
         int n = sc.nextInt();
         int a[] = new int[n];
         System.out.println("Enter elements in to the array");
         for(int i=0;i<n;i++)
         {
        	 a[i] = sc.nextInt();
         }
         Threesum t = new Threesum();
         t.Arraysum(a);
	}

}
