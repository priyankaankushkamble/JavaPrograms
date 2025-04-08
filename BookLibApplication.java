class Book
{
   private int id;
   private String name;
   private String author;
   
   public void setId(int id)
   { this.id=id;
   }
   public int getId(){
     return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName(){
     return name;
	}
	public void setAuthor(String author)
	{ this.author=author;
	}
	public String getAuthor(){
	return author;
	}
}
class Library
{
   void setBooks(Book ...b)
   {
        for(int i=0;i<b.length;i++)
		{
		 System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getAuthor());
		}
   }
}

public class BookLibApplication
{
     public static void main(String x[])
	 {
	     Library l = new Library();
		 
		 Book b1 = new Book();
		 b1.setId(1);
		 b1.setName("ABC");
		 b1.setAuthor("XYZ");
		 
		 Book b2 = new Book();
		 b2.setId(2);
		 b2.setName("XYZ");
		 b2.setAuthor("PQR");
		 
		 Book b3 = new Book();
		 b3.setId(3);
		 b3.setName("STV");
		 b3.setAuthor("MNO");
		 
		 l.setBooks(b1,b2,b3);
	 }
}
