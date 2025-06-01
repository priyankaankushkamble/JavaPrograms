interface A
{
	void show();
}
interface B
{
	void show();
}
class C
{
	void show()
	{
		System.out.println("I am Show Method of clas C");
	}
}
class D extends C implements A,B
{
	public void show()
	{
		System.out.println("I am  Show method of D");
	}
}
public class ExtendsKeyApp
{
	public static void main(String x[])
	{
		D d1=new D();
		d1.show();
	}
}