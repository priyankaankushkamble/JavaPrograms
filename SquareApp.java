import java.util.*;
class Square
{
	int no;
	Scanner xyz=new Scanner(System.in);
	void setvalue()
	{
			System.out.println("Enter the values");
			no=xyz.nextInt();
	}
		void showsquare
		{
			System.out.printf("Square is %d\n",no*no);
		}
}
public class SquareApp
{
	public static void main(String x[])
	{
		Square sq=new Square();
		sq.setvalue();
		sq.showSquare();
	}
}