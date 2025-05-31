public class SquareApp
{
	public static void main(String x[])
	{
		calSquare(5);
		calSquare(5.5f);
	}
	public static void calSquare(int m)
    { 
		 System.out.printf("Square of integer is:%d\n",m*m);
    }
    public static void calSquare(float n)
    {  
		System.out.printf("Square of float is:%f\n",n*n);
    }
}