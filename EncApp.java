class AccessProduct
{
	private String prodName,prodDealName,prodCompName;
	private int purPrice,salePrice;

	public void setDetails(String prodName,String prodDealName,String prodCompName,int purPrice,int salePrice)
	{
		this.prodName=prodName;
		this.prodDealName=prodDealName;
		this.prodCompName=prodCompName;
		this.purPrice=purPrice;
		this.salePrice=salePrice;
	}
	public void verifyUser(String loginType)
	{
		if(loginType.equals("admin"))
		{
		System.out.println(prodName+"\t"+prodDealName+"\t"+prodCompName+"\t"+purPrice+"\t"+salePrice);
		}
		else if(loginType.equals("employee"))
		{
			System.out.println(prodName+"\t"+prodCompName+"\t"+salePrice);
		}
		else
		{
			System.out.println("Invalid User");
		}
	
	}
}
public class EncApp
{
	public static void main(String x[])
	{
		AccessProduct acp=new AccessProduct();
		acp.setDetails("ABC","ABC Dealer","ABC Company","10,20");
		acp.verifyUser("employee");
	}
}