interface ABC
{
	default void show()
	{
		System.out.println("I am default method of interface");
	}
}
class MNO implements ABC
{
	
}
public class DefaultInfApp
{
	public static void main(String x[])
	{
		MNO m=new MNO();
		m.show();
	}
}