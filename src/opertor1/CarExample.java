package opertor1;

public class CarExample {
public static void main(String[] args)
{
	Car car=new Car();
	car.setSpeed(100);
	CarExample carExample=new CarExample();
	carExample.aMethod(car);
	System.out.print("speed "+car.getSpeed());
	
}
public void aMethod(Car car) {
	car.setSpeed(300);
}
	
	
}
