/*To Customize parent logic according the child class*/
class Ram
{
	int perHeadProp;
	final void distributeproperty(int totalproperty)
	{
		perHeadProp=totalproperty/3;
		System.out.println("Per head Property "+perHeadProp);
	}
	void eduPlan()
	{
		System.out.println("Child should be doctor");
	}
}
class Shyam extends Ram
{
} 
class Ghanshyam extends Ram
{
	void eduPlan()
	{
		System.out.println("I want doctor");
	}
}
public class OverridingApp
{
	public static void main(String x[])
	{
		Shyam s=new Shyam();
		s.eduPlan();
		s.distributeproperty(10000);
		Ghanshyam gs=new Ghanshyam();
		gs.eduPlan();
	}
}
