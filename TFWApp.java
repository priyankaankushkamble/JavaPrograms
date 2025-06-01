abstract class TFW
{
	int m;
	TFW()
	{
	m=100;
	System.out.println("M initilize by abstract class constructor "+m);
	}
}
class MNO extends TFW
{
	
}
public class TFWApp
{
	public static void main(String x[])
	{
		MNO m=new MNO();
	}
}