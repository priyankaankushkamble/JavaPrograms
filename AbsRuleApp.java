abstract class D
{
	abstract void show();
	void display()
	{
		System.out.println("I am non abstract method");
	}
	}
class M extends D
{
	void show()
{
		System.out.println("I am abstract method");
	
}
	}
public class AbsRuleApp
{
	public static void main(String x[])
	{
	M m1=new M();
	m1.display();
	m1.show();
	
}
}