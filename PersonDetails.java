package OOP;
import java.util.*;
class Per
{
	private int id;
	private String name;
	private int age;
	private String address;
	
	
	public Per(int id,String name,int age,String address)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void DisplayPersonData()
	{
		System.out.println("Person id is:"+id);
		System.out.println("Person name is:"+name);
		System.out.println("Person age is:"+age);
		System.out.println("Person address is:"+address);
		System.out.println("-------------------------------");
	}
	
	
}
public class PersonDetails
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		ArrayList<Per> persons = new ArrayList<>();

        System.out.print("Enter the number of persons: ");
        int n = xyz.nextInt();
        xyz.nextLine();

        for(int i=0;i<n;i++) 
        {
        System.out.println("\nEnter details for person"+(i+1));
		xyz.nextLine();
		System.out.println("Enter person id");
		int id=xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Enter person name");
		String name=xyz.nextLine();
		
		System.out.println("Enter person age");
		int age=xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Enter person address");
		String address=xyz.nextLine();

		Per pe=new Per(id,name,age,address);
		persons.add(pe);
        }
        System.out.println("\nDisplaying All Person Data:");
        for(Per p:persons) 
        {
           p.DisplayPersonData();
        }
	}
}
