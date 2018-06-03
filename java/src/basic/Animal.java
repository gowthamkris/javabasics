package basic;

public abstract class Animal implements Travel {

	@Override
	public int getspeed() {
		// TODO Auto-generated method stub
		return 0;
	}

}
class Cat extends Animal
{
	@Override
	public int getspeed() {
		System.out.println(i);
		System.out.println("Cat is called");
		return 0;
	}
	
}
class Dog extends Animal
{
	@Override
	public int getspeed() {
		System.out.println(i);
		System.out.println("Dog is called");
		return 0;
	}
	
}
class Tiger extends Animal
{
	@Override
	public int getspeed() {
		System.out.println(i);
		System.out.println("Tiger is called");
		return 0;
	}
	
}

