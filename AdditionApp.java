class Add
{
	int a,b;
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
	void showAdd()
	{
		System.out.printf("Addition is %d\n",a+b);
	}
}
public class AdditionApp
{
	public static void main(String x[])
	{
		Add ad=new Add(); 
		ad.setValue(10,20);
		ad.showAdd();
	}
}