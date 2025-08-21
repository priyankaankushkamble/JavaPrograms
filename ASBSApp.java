class AS
{
	static void show()
	{
	System.out.println("I am Parent Method");
	}
}
class BS extends AS
{
	static void show()
	{
	System.out.println("I am Child Method");
	}
}
public class ASBSApp
{
	public static void main(String x[])
	{
		BS b=new BS();
		b.show();
	}
}