package OOP;
import java.util.*;
public class TableTwoFunction 
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=xyz.nextInt();
		showTable(no);
	}
		
		
		public static void showTable(int no)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%d\n",i*no);
			}
		}
}


