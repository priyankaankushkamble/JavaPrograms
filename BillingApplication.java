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
		
}
class Product
{
	private int id;
	private String name;
	private int price;
	private int qty;
	private int rate;
	
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
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getQty()
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
}
class Bill
{
	public void calBill(Customer c,Product...p)
	 {
        System.out.println("========= CUSTOMER BILL =========");
        System.out.println("Customer ID   : " + c.getId());
        System.out.println("Customer Name : " + c.getName());
        System.out.println("Mobile No.    : " + c.getMobile());
        
        
	 }
}

public class BillingApplication
{

	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		Customer c=new Customer();
	}
}
