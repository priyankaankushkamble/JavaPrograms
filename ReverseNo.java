package OOP;
import java.util.*;
public class ReverseNo 
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		int rem,r,no;
		System.out.println("Enter the number");
		no=xyz.nextInt();
		int result=getReverse(no);
		System.out.printf("Reverse No is:%d\n",result);
	}
		public static int getReverse(int y)
		{
		  int r=0,rem;
		  while(y!=0)
		  {
				rem=y%10;
				y=y/10;
				r=r*10+rem;
		  }
					return r;
		 }
}

