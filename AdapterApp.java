abstract class XYZ
{
	abstract void s1();
	abstract void s2();
	abstract void s3();

}
class M extends XYZ
{
	void s1(){

	
	}	
	void s2(){
}
	void s3()
	{
	
	}
}
class A extends M
{
	void s1()
	{
		System.out.println("I required s1");
	}
}
class B extends M
{
	void s2()
	{
	System.out.println("I required s2 method");
}
}
public class AdapterApp
{
	public static void main(String x[])
	{
		A a1=new A();
		a1.s1();
		B b2=new B();
		b2.s2();
	}
}