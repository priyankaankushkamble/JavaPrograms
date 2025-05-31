public class BillingApp
{
	public static void main(String x[])
	{
		calBill(10,100);
		calBill(10,100,18);
	}
	public static void calBill(int qty,int rate)
	{
		System.out.printf("Bill without gst %d\n",qty*rate);
	}
		public static void calBill(int qty,int rate,int gstRate)
		{
			int gstAmt=(qty*rate)*gstRate/100;
			 int total=(qty*rate)+gstAmt; 
			System.out.printf("Bill with gst %d\n",total);
		}
}