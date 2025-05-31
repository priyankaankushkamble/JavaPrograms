class A
{
	void show()
	{
		System.out.println("I am A method");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("I am B Method");
	}
}
public class SuperMethodApp
{
	public static void main(String x[])
	{
		B b1=new B();
		b1.display();
	}
}