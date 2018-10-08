import java.util.LinkedList;
import java.util.Stack;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> num1 = new LinkedList<Integer>();
		LinkedList<Integer> num2 = new LinkedList<Integer>();
		LinkedList<Integer> result = new LinkedList<Integer>();
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		num1.add(123456789);
		num2.add(987654321);
		int N = num1.size();
		int M = num2.size();
		while(N>0)
		{
			stack1.push(N%10);
			N=N/10;
		}
		while(M>0)
		{
			stack2.push(M%10);
			M=M/10;
		}
		while(!stack1.isEmpty() && !stack2.isEmpty())
		{
			int a = stack1.pop();
			int b = stack2.pop();
			result.add(a+b);
			a=0;
			b=0;
		}
		for(int a:result)
		{
			System.out.println(a);
		}
		
		
		

	}

}
