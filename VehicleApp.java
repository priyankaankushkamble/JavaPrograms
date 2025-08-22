abstract class Vehicle
{
	abstract void engine();
}
class Car extends Vehicle
{
	void engine()
	{
	System.out.println("1000 cc Required");
	}
}
class Bike extends Vehicle
{
	void engine(){
	System.out.println("100 cc Required");
	}
}
public class VehicleApp
{
	public static void main(String x[])
	{
		Car c=new Car();
		c.engine();
		Bike b=new Bike();
		b.engine();
	}
}