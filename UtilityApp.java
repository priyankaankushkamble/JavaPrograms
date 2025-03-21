class U
{
	private U()
	{
	
	}
	static void show()
	{
		System.out.println("I am show method of U");
	}
		static void display()
		{
			System.out.println("I am show method of display");
		}
}
public class UtilityApp
{
	public static void main(String x[])	
	{
		U.show();	
		U.display();
	}
}