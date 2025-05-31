class P
{
	void show()
	{
	System.out.println("I am Show Method");
	}
}
class C extends P
{
	protected void show()
	{
		System.out.println("I am C method");
	}
}
public class TestMethodApp
{
	public static void main(String x[])
	{
		C c1=new C();
		c1.show();
	}
}