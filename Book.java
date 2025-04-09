package OOP;
import java.util.*;
class Bookk
{
	private int id;
	private String name;
	private int price;
	private String author;
	
	
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
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public String getAuthor() 
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
}

public class Book 
{
	public static void main(String[] args)
	{
		Bookk bo=new Bookk();
		bo.setId(1);
		bo.setName("Java");
		bo.setPrice(800);
		bo.setAuthor("Games Gosling");
		
		System.out.println("Id is:"+bo.getId());
		System.out.println("Name is:"+bo.getName());
		System.out.println("Price is:"+bo.getPrice());
		System.out.println("Author is:"+bo.getAuthor());
	}

}
