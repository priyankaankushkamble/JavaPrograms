class P
{
	int no;
	void setValue(int x,int y)
	{
	no=x;
	}
}
class C extends P
{
	int setValue(int x)
	{
		System.out.println("X is "+x);
		return x;
	}
}
public class PCApplication
{
public static  void main(String x[])
	{
		C c1=new C();
		c1.setValue(10);
	}
}