package OOP;
import java.util.*;
class Personn
{
	private int id;
	private String name;
	private int age;
	private String address;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	
	
}
public class Person
{
	public static void main(String[] args) 
	{
		Personn p=new Personn();
		p.setId(1);
		p.setName("Sonuu");
		p.setAge(20);
		p.setAddress("A/P Pandharpur");
		
		System.out.println("Id is:"+p.getId());
		System.out.println("Name is:"+p.getName());
		System.out.println("Age is:"+p.getAge());
		System.out.println("Address is:"+p.getAddress());

	}

}
