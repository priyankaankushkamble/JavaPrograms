import java.util.*;
class Max
{
	int arr[];
	void setA(int a[])
	{
		arr=a;
	}
	int getmax()
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
}
public class MaxApp
{
	public static void main(String x[])
	{
	int marr[]=new int[5];
	Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the values in array");
		for(int i=0;i<marr.length;i++)
		{
			marr[i]=xyz.nextInt();
		}
			Max m=new Max();	
	  		m.setA(marr);
	 	      int result=m.getmax(); 
	  		System.out.printf("Max value is:%d\n",result);
	}
}

