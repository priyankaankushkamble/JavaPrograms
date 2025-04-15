package OOP;
import java.util.*;
class Laptopp
{
	private int id;
	private String name;
	private int price;
	private int ram;
	private int harddisk; 
	
	public Laptopp(int id,String name,int price,int ram,int harddisk)
	{
	this.id=id;
	this.name=name;
	this.price=price;
	this.ram=ram;
	this.harddisk=harddisk;
	}
	public void displayLaptopDetails()
	{
		System.out.println("Laptop id is:"+id);
		System.out.println("Laptop name is:"+name);
		System.out.println("Laptop Price is:"+price);
		System.out.println("Laptop Ram is:"+ram);
		System.out.println("Laptop Harddisk is:"+harddisk);
	}
}	
public class Laptop
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter Laptop ID:");
        int id =xyz.nextInt();
        xyz.nextLine();
		
        System.out.println("Enter laptop Name:");
        String name=xyz.nextLine();
        
        System.out.println("Enter Laptop Price");
        int price=xyz.nextInt();
        
        System.out.println("Enter Laptop ram size:");
        int ram=xyz.nextInt();
        
        System.out.println("Enter the Laptop Harddisk");
        int harddisk=xyz.nextInt();
        
        Laptopp lap=new Laptopp(id,name,price,ram,harddisk);
        System.out.println("LaptopDetails:");
        lap.displayLaptopDetails();
        }
	}
