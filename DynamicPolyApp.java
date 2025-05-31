class Value
{
	int a,b;
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int getResult()
	{
		return 0;
	}
}
class Add extends Value
{
	int getResult()
	{
	return a+b;
	}
}
class Mul extends Value
{
	int getResult()
	{
		return a*b;
	}
}
public class DynamicPolyApp
{
	public static void main(String x[])
	{
		Value v=null;
		v=new Add();

		System.out.println("Hash Code of add object is "+System.identityHashCode(v));
		v.setValue(10,20);
		int result=v.getResult();
		System.out.printf("Addition is %d\n",result);
		v=new Mul();
		v.setValue(5,4);
		System.out.println("Hash code of mul object is "+System.identityHashCode(v));
		result=v.getResult();
		System.out.printf("Multiplication is %d\n",result);
	}	
}