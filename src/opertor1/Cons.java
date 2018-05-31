package opertor1;

public class Cons {
	String model;
	double speed;
	public Cons() {
		System.out.println("cons called");
		
	}
	public Cons(int speed) {
		this.speed=speed;
		System.out.println(" one arg cons called");
		
	}
	public Cons(int speed,String model) {
		this.speed=speed;
		this.model=model;
		System.out.println("two arg cons called");
		
	}
	public boolean start() {
		return true;
	}
	public void correction() {
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cons cons1=new Cons();
		Cons cons2=new Cons(100);
		Cons cons3=new Cons(100,"gowtham");
		cons1.speed=20.0;
		cons2.speed=40.0;
		System.out.println(cons1.speed);
		System.out.println(cons2.speed);
		System.out.println(cons3.model);

	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	}



