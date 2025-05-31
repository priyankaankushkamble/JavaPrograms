abstract class Employee
{
	abstract void skillSet();
}
class Developer extends Employee
{
	void skillSet()
	{
		System.out.println("Good Communication Skill");
		System.out.println("Need good coding skill");
		System.out.println("Need good behaviour and seating capacity");
	}
}
class Ck extends Employee
{
	void skillSet()
	{
		System.out.println("Knowlege about cooking");
		System.out.println("Info about good quality food");
	}
}
public class HRConApp
{
	public static void main(String x[])
	{
		Developer d=new Developer();
		System.out.println("Skill Required for Developer");
		d.skillSet();
		System.out.println();
		System.out.println("==================================");
			System.out.println("Skill Required for cook");
		System.out.println("==================================");
		System.out.println();
		Ck c=new Ck();
		c.skillSet();
	}
}