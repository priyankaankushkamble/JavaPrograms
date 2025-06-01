interface A
{
	void show();
}
interface B extends A
{
	void display();
}
class C implements B
{
	public void show()
	{
	System.out.println("I am A method of interface");
	}
	public void display()
	{
	System.out.println("I am B method of interface");
	}
}
public class ExtendedApp
{
	public static void main(String x[])
	{
		C c1=new C();
		c1.show();
		c1.display();
	}
}