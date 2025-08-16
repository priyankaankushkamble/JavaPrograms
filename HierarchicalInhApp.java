class Value
{
	int a,b;
	void setValue(int x,int y)
	{
	a=x;
	b=y;
	}
}
class Add extends Value
{
	int getAdd()
	{
		return a+b;
	}
}
class Mul extends Value
{
	int getMul()
	{
		return a*b;
	}
}
public class HierarchicalInhApp
{
	public static void main(String x[])
	{
		Add ad=new Add();
		ad.setValue(10,20);
		int result=ad.getAdd();
		System.out.printf("\n Addition is %d\n",result);

	Mul m=new Mul();
	m.setValue(5,4);
	result=m.getMul();
	System.out.printf("Multiplication is %d\n",result);	
	}
}