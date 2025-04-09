package OOP;
import java.util.*;
class Playerr
{
	private int id;
	private String name;
	private int run;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getRun() 
	{
		return run;
	}
	public void setRun(int run)
	{
		this.run = run;
	}
	
}
public class Player
{
	public static void main(String x[])
	{
		Playerr pla=new Playerr();
		pla.setId(1);
		pla.setName("Priya");
		pla.setRun(19);
		
		System.out.println("Id is:"+pla.getId());
		System.out.println("Name is:"+pla.getName());
		System.out.println("Run is:"+pla.getRun());
	}
}