class Product
{
	private int id;
	private String name;
	private int qty;
	private int rate;

	public void setid(int id)
	{
		this.id=id;
	}
		public int getid()
		{
			return id;
		}
	public void setname(String name)
	{
		this.name=name;
	}
		public String getname()
		{
			return name;
		}
	public void setqty(int qty)
	{
		this.qty=qty;
	}
		public int getqty()
		{
			return qty;
		}
	public void setrate(int rate)
	{
		this.rate=rate;
	}
		public int getrate()
		{
			return rate;
		}
	public int getTotal()
	{
		return qty*rate;
	}
}
class Customer
{
	private int id;
	private String name;
	private String address;
	
	public void setid(int id)
	{
		this.id=id;
	}
		public int getid()
		{
			return id;
		}
	public void setname(String name)
	{
		this.name=name;
	}
		public String getname()
		{
			return name;
		}
	public void setaddress(String address)
	{
		this.address=address;
	}
		public String getaddress()
		{
			return address;
		}
}
class Bill
{
		private Customer customer;
		private Product[] products;

		void acceptCustDetails(Customer customer,Product...p)
		{
			this.customer=customer;
			this.products=p;
		}
		void calDisplayBill()
		{
			if(customer==null||products==null)
			{
				System.out.println("No customer or product details available");
				return;
			}
		int grandTotal = 0;
		System.out.println("Cust Id: " + customer.getid() + " Cust Name: " + customer.getname() + " Address: " + customer.getaddress());
        	System.out.println("--------------------------------------------------");
		System.out.printf("%-9s %-10s %-10s %-6s %-6s\n", "Prod Id", "Name", "Quantity", "Rate", "Total");
		System.out.println("--------------------------------------------------");
	
			for (Product p:products) 
	     		{
            		int total = p.getTotal();
            		grandTotal += total;
            		System.out.printf("%-9d %-10s %-10d %-6d %-6d\n", p.getid(), p.getname(), p.getqty(), p.getrate(), total);
            		}

        	System.out.println("--------------------------------------------------");
        	System.out.println("Grand Total is: " + grandTotal);
    }
}

public class BillApplication
{
	public static void main(String x[])
	{
		Bill b=new Bill();

		Customer customer=new Customer();
		customer.setid(1);
		customer.setname("ABC");
		customer.setaddress("Warje");
		
		Product p1=new Product();
		p1.setid(1);
		p1.setname("A");
		p1.setqty(10);
		p1.setrate(10);

		Product p2=new Product();
		p2.setid(2);
		p2.setname("B");
		p2.setqty(20);
		p2.setrate(100);

		Product p3=new Product();
		p3.setid(3);
		p3.setname("C");
		p3.setqty(30);
		p3.setrate(50);

		b.acceptCustDetails(customer,p1,p2,p3);
		b.calDisplayBill();
	}
}