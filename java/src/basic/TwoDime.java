package basic;

public class TwoDime extends Shape{
public void Square()
{
	area=(length*length);
	System.out.println("square");
	System.out.println(area);
}
public void Rectangle()
{
	area=(length*Width);
	System.out.println("Rectangle");
	System.out.println(area);
}
public void Circle()
{
	area=3.14*(radius*radius);
	System.out.println("Circle");
	System.out.println(area);
}
public void Triangle()
{
	area=(length*Width)/2.0;
	System.out.println("Triangle");
	System.out.println(area);
	
}
}
