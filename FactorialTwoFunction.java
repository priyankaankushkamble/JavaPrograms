package OOP;
import java.util.*;
public class FactorialTwoFunction 
{
	public static void main(String[] args)
	{
			Scanner xyz=new Scanner(System.in);
			int no;
			System.out.println("Enter the number");
			no=xyz.nextInt();
			int result=getFactorial(no);
			System.out.println("Factorial is:"+result);
	}
			public static int getFactorial(int x)
			{
			int f=1;
			for(int i=1;i<=x;i++)
			{
			f=f*i;
			}
			return f;
			}
}

