import java.util.*;
public class ArmStrongWhile
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int no,rem,sum=0,count=0,temp,p,j,rev=0;
		System.out.println("Enter the number");
		no=xyz.nextInt();
		temp=no;
		while(no!=0)
		{
			no=no/10;
			++count;
		}
		no=temp;
		while(no!=0)
		{
		rem=no%10;
		no=no/10;
		p=1;
		j=1;
	while(j<=count)
		{
			p=p*rem;
			j++;
		}
		sum=sum+p;
		}
			if(sum==temp)
			{
			System.out.println("number is armstrong");
			}
			else
			{
			System.out.println("number is not armstrong");
			}
	}
}