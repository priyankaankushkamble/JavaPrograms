class A
{
	A()
	{
		System.out.println("I am Parent Constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("I am Child Constructor");
	}
}
public class InhConstructorApp
{
	public static void main(String x[])
	{
		B b1=new B();
	}
}