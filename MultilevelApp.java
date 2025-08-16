import java.util.*;
class Board
{
	String boardName;
	void setBoardName(String boardName)
	{
		this.boardName=boardName;
	}
	
}
class STD extends Board
{
	int marks[];
	String stdName,studName;

	void setMarks(String stdName,String studName,int smarks[])
	{
		this.stdName=stdName;
		this.studName=studName;
		this.marks=smarks;
	}
}
class Result extends STD
{
	void showResult()
	{
		System.out.println("Board Name is:"+boardName);
		System.out.println("STD name is:"+stdName);
		System.out.println("Student Name is:"+studName);
	int per=0;
	for(int i=0;i<marks.length;i++)
	{
		per=per+marks[i];
	}
	System.out.println("Percentage is:"+(per/marks.length));
	}
} 
public class MultilevelApp
{
	public static void main(String x[])
	{
	Result r=new Result();
	Scanner xyz=new Scanner(System.in);
	int a[]=new int[6];
	System.out.println("Enter Board Name");
	String boardName=xyz.nextLine();
	System.out.println("Enter Standard Name");
	String stdName=xyz.nextLine();
	System.out.println("Enter Student Name");
	String studName=xyz.nextLine();
	System.out.println("Enter Marks of student");
	for(int i=0;i<a.length;i++)
	{
		a[i]=xyz.nextInt();
	}
	r.setBoardName(boardName);
	r.setMarks(stdName,studName,a);
	r.showResult();
	}
}