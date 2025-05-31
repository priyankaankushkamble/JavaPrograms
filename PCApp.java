class P
{
	static void show()
	{
		System.out.println("I am Parent");
	}
}
class C extends P
{
	static void show()
	{
		System.out.println("I am Child method");
	}
}
public class PCApp
{
	public static void main(String x[])
	{
		P p1=new C();
		p1.show();
	}
}