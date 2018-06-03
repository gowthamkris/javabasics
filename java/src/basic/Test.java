package basic;

public class Test {
public static void main(String[] args) {
	Travel t1=new Car();
	Travel t2=new Cycle();
	Travel t3=new Truck();
	Travel t4=new Cat();
	Travel t5=new Dog();
	Travel t6=new Tiger();
	System.out.println(t1 instanceof Car);
	System.out.println(t2 instanceof Dog);

	System.out.println(t3 instanceof Truck);

	System.out.println(t4 instanceof Cat);
	System.out.println(t5 instanceof Dog);
	System.out.println(t6 instanceof Tiger);

   t1.getspeed();
   
	
}
}
