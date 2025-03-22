class S
{
	private static S s1=null;
	private S()
	{
		System.out.println("I am singleton class");
	}
	public static S getInstance()
	{
		if(s1==null)
		{
			s1=new S();
		}
			return s1;
	}
}
public class SingletoneApp
{
	public static void main(String x[])
	{
		S s1=S.getInstance();
		S s2=S.getInstance();
		S s3=S.getInstance();
	}
}