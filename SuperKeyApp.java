class A
{
	void show()
	{
	System.out.println("I am A method");
	}
}
class B extends A
{
	void show()
	{
	super.show();
	System.out.println("I am B Method");
	}
}
public class SuperKeyApp
{
	public static void main(String x[])
	{
		B b1=new B();
		b1.show();
	}
}