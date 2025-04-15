package OOP;
import java.util.*;
class Voter
{
	private int id;
	private String name;
	private int age;
	private int mark;
	
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
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getMark() 
	{
		return mark;
	}
	public void setMark(int mark) 
	{
		this.mark = mark;
	}
}
class VotingMachine
{
		public void acceptvoter(Voter...voters)
		{
			System.out.println("\n=======Eligible Voters(age>18)==========");
			for(Voter v:voters)
			{
				if(v.getAge()>18)
				{
					System.out.println("ID:"+v.getId());
					System.out.println("Name:"+v.getName());
					System.out.println("Age:"+v.getAge());
					System.out.println("Mark:"+v.getMark());
					System.out.println("---------------------------");
				}
			}
		}
}
		
public class VotingApplication
{

	public static void main(String[] args)
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Enter Number of voters:");
		int no=xyz.nextInt();
		xyz.nextLine();
		Voter[]voters=new Voter[no];
		for(int i=0;i<no;i++)
		{
			voters[i]=new Voter();
			System.out.println("\nEnter details for voter"+(i+1));
			System.out.print("ID:");
			voters[i].setId(xyz.nextInt());
			xyz.nextLine();
			System.out.print("Name:");
			voters[i].setName(xyz.nextLine());
			System.out.print("Age:");
			voters[i].setAge(xyz.nextInt());
			System.out.print("Mark:");
			voters[i].setMark(xyz.nextInt());
		}
		VotingMachine vm=new VotingMachine();
		vm.acceptvoter(voters);
	}
}

	