import java.util.*;
class Power
{
	int base,index;
	Power(int base,int index)
	{
		this.base=base;
		this.index=index;
	}
		int getpower()
		{
		int p=1;
		for(int i=0;i<index;i++)		
			{
				p=p*base;
			}
		
			return p;
		}
}
public class PowerApp
{
		public static void main(String x[])
		{
			Scanner xyz=new Scanner(System.in);
			int base,index;
			System.out.println("Enter base and index");
			base=xyz.nextInt();
			index=xyz.nextInt();
			
			Power p=new Power(base,index);
			int result=p.getpower();
			System.out.println("Power is:"+result);

		 
		}
}

