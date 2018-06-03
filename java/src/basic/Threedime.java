package basic;

public class Threedime extends Shape {
public void Cube()
{
	area=6*(length*length);
	System.out.println("Cube");
	System.out.println(area);
}
public void Cylinder()
{
	area=(2*3.14*radius)*(length+radius);
	System.out.println("Cylinder");
	System.out.println(area);
}
}
