class P{
	P(int x)
	{
		System.out.println("I am Parenet Class");
	}
}
class Q extends P{
	Q()
	{
		super(100);
		System.out.println("I am Child Constructor");
	}
}
public class SuperInhConApp
{
	public static void main(String x[])
	{
		Q q1=new Q();	}
}