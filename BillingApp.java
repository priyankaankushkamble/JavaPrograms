package AprilTest.org;
import java.util.*;
class Customerr
{

		private int cid;
		private String cname;
		private int mob;
		public int getCid() 
		{
			return cid;
		}
		public void setCid(int cid)
		{
			this.cid = cid;
		}

		public String getCname()
		{
			return cname;
		}
		public void setCname(String cname)
		{
			this.cname = cname;
		}
		public int getMob()
		{
			return mob;
		}
		public void setMob(int mob) 
		{
			this.mob = mob;
		}

}
class Productt {
	private int pid;
	private String pname;
	private int qty;
	private int rate;
	private int total;
	public int getTotal() {
		return total=qty*rate;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
}

class Billl
{
	public void calBilll(Customer c ,Product ...p)
	{	
		int totalAmount=0;
		int total=0,q=0,rate;
		System.out.println("customer id"+c.getId());
		System.out.println("customer name"+c.getName());
		System.out.println("customer mob"+c.getMobile());
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("id   name    quantity    rate    total");
		for(int i=0;i<p.length;i++)
		{
			System.out.print( p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getRate()+"\t"+p[i].getTotal()+"\n");
			q=p[i].getQty();
			rate=p[i].getRate();
			total=p[i].getTotal();
			totalAmount=totalAmount+total;
		}
		System.out.println("_______________________");
		System.out.println("                      complete\t"+ totalAmount);
		
		
	}

}
public class BillingApp 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer details");
		Customer c=new Customer();
		int cid=sc.nextInt();
		sc.nextLine();
		String cname=sc.nextLine();
		int mob=sc.nextInt();
		
		c.setId(cid);
		c.setName(cname);
		c.setMobile(mob);
		Product p[]= new Product[2];
		for(int i=0;i<p.length;i++)
		{	
			System.out.println("ENter product details");
			p[i] = new Product(); 
			p[i].setId(sc.nextInt());
			sc.nextLine();
			p[i].setName(sc.nextLine());
			p[i].setQty(sc.nextInt());
			p[i].setRate(sc.nextInt());
		
		}
		Billl b=new Billl();
		b.calBilll(c, p);
	}
}	
	
