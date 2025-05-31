class Per
{
	int per;
	void setMarks(int marks[])
	{
		int agg=0;
		for(int i=0;i<marks.length;i++)
		{
			agg=agg+marks[i];
		}
		per=agg/marks.length;
	}
}
class Nine extends Per
{
	void showNinePer()
	{
		System.out.println("Nine Percentage is:"+per);
	}
}
class Ten extends Per
{
	int year;
	void askAddmissionYear(int year)
	{
		this.year=year;
	}
	void setmarks(int marks[])
	{
		int agg=0;
		if(year<2008)
		{
			super.setMarks(marks);
		}
		else
		{
		for(int i=0;i<marks.length;i++)
		{
			for(int j=(i+1);j<marks.length;j++)
			{
					if(marks[i]<marks[j])
				{
					int temp=marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
				}
			}
		}
			for(int i=0;i<marks.length;i++)
			{
				agg=agg+marks[i];
			}
			per=agg/(marks.length-1);
		}
	}
	void showTenPer()
	{
		System.out.println("Ten Percentage is:"+per);
	}
}
public class BestFiveSuperApp
{
	public static void main(String x[])
	{
		int a[]=new int[]{80,90,70,60,90};
		Nine n=new Nine();
		n.setMarks(a);
		n.showNinePer();

		Ten t=new Ten();
		t.askAddmissionYear(2015);
		t.setmarks(a);
		t.showTenPer();
	}
}