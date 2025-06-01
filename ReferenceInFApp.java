interface ABC
{
	void show();
	
}
class MNO implements ABC
{
	public void show()
	{
	System.out.println("I am reference of interface");
	}
}
public class ReferenceInFApp
{
	public static void main(String x[])
	{
		ABC a1=new MNO();
		a1.show();
	}
}