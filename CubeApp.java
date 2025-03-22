class Cube
{
	Cube(int x)
	{
		System.out.printf("Cube of integer x is:%d\n",x*x*x);
	}
	Cube(float x)
	{
		System.out.printf("Cube of floating x is:%f\n",x*x*x);
	}
}
public class CubeApp
{
	public static void main(String x[])
	{
		Cube c1=new Cube(5);
		Cube c2=new Cube(5.5f);
	}
} 