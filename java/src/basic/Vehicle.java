package basic;

public abstract class Vehicle implements Travel{

	

}
class Car extends Vehicle
{
	@Override
	public int getspeed() {
		System.out.println(i);
		System.out.println("car is called");
		return 0;
	}
	
}
class Cycle extends Vehicle
{
	@Override
	public int getspeed() {
		System.out.println(i);
		System.out.println("Cycle is called");
		return 0;
	}
	
}
class Truck extends Vehicle
{
	@Override
	public int getspeed() {
		System.out.println(i);
		System.out.println("Truck is called");
		return 0;
	}
	
}
