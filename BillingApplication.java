<<<<<<< HEAD
package AprilTest.org;
import java.util.*;
class Customer
{
	private int id;
	private String name;
	private long mobile;
	
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
	public long getMobile()
	{
		return mobile;
	}
	public void setMobile(long mobile)
	{
		this.mobile = mobile;
	}

=======
package OOP;
import java.util.*;
class Customer
{
		private int id;
		private String name;
		private long mobile;
		
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
		public long getMobile()
		{
			return mobile;
		}
		public void setMobile(int mobile) 
		{
			this.mobile = mobile;
		}
		
>>>>>>> 4649e139504777652fbc5a84fdf7151a41b1f29c
}
class Product
{
	private int id;
	private String name;
	private int price;
	private int qty;
	private int rate;
	
<<<<<<< HEAD
	public int getId() 
=======
	public int getId()
>>>>>>> 4649e139504777652fbc5a84fdf7151a41b1f29c
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
<<<<<<< HEAD
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
=======
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
>>>>>>> 4649e139504777652fbc5a84fdf7151a41b1f29c
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
<<<<<<< HEAD
	public int getQty() 
=======
	public int getQty()
>>>>>>> 4649e139504777652fbc5a84fdf7151a41b1f29c
	{
		return qty;
	}
	public void setQty(int qty)
	{
		this.qty = qty;
	}
	public int getRate()
	{
		return rate;
	}
	public void setRate(int rate)
	{
		this.rate = rate;
	}
<<<<<<< HEAD
	

}




class Bill
{
	int totalAmount;
		public void calBill(Customer c,Product ...p)
		{
			int totalAmount=0;
			int total=0,q,rate;
			System.out.println("Customer Details");
			System.out.println("_____________________________________________");
			
			System.out.println("Customer id:"+c.getId());
			System.out.println("Customer name:"+c.getName());
			System.out.println("Customer mobile: "+c.getMobile());
			System.out.println("---------------------------------------------------------");
			System.out.print("id\tName\tQuntity\tRate\tTotal");
			for(int i=0;i<p.length;i++)
			{
				
				System.out.println();
				q=p[i].getQty();
				rate=p[i].getRate();
				
				totalAmount=q*rate;
				
			
				System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getRate()+"\t"+totalAmount);
				System.out.println();
				total=total+totalAmount;
			}
			
			System.out.println("                      Complete: "+total);
		}
}

public class BillingApplication 
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Customer Details");
		Customer c=new Customer();
		System.out.println("Customer Id: ");
		int CId=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Customer Name: ");
		String CName=xyz.nextLine();
		System.out.println("Customer Mobile: ");
		long mobile=xyz.nextLong();
		
		c.setId(CId);
		c.setName(CName);
		c.setMobile(mobile);
		
		
		System.out.println("Enter no of products:");
		int n=xyz.nextInt();
		Product[]p=new Product[2];
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter Product Details");
			p[i]=new Product();
			System.out.println("Product Id:");
			p[i].setId(xyz.nextInt());
			xyz.nextLine();
			System.out.println("Product Name:");
			p[i].setName(xyz.nextLine());
			System.out.println("Product Quantity:");
			p[i].setQty(xyz.nextInt());
			System.out.println("Product Rate:");
			p[i].setRate(xyz.nextInt());
		}
		Bill b=new Bill();
		b.calBill(c,p);
=======
}
class Bill
{
	public void calBill(Customer c,Product...p)
	 {
        System.out.println("========= CUSTOMER BILL =========");
        System.out.println("ID: " + c.getId());
        System.out.println("Name: " + c.getName());
        System.out.println("Quantity: "+ c.getQty());
        System.out.println("Rate:"+c.getrate());
        System.out.println("Total:"+c.getTotal());
        System.out.println("-------------------------------------");
        System.out.println("Complete:");
        tottal+=total;
        
	 }
}

public class BillingApplication
{
	public static void main(String[] args) 
	{
			
		Scanner xyz=new Scanner(System.in);
		Customer c=new Customer();
		
		System.out.println("Enter Customer ID:");
		int id=xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Enter customer Name:");
		String name=xyz.nextInt();
		xyz.nextInt();
		
		System.out.println("Enter Quantity:");
		int quantity=xyz.nextInt();
		xyz.nextLine();
		
		System.out.println("Enter Rate:");
		int rate=xyz.nextInt();
		xyz.nextLine();
		
	
		Customer c=new Customer();
		c.calbill=total;
		
>>>>>>> 4649e139504777652fbc5a84fdf7151a41b1f29c
	}
}
