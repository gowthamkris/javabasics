package opertor1;

public class Rectangle {
double Length;
double breadth;
Rectangle(double Length,double breadth)
{
	this.Length=Length;
	this.breadth=breadth;
}
public double getLength() {
	return Length;
}
public void setLength(double length) {
	Length = length;
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
}
double getArea()
{
	return Length*breadth;
}
double getPerimeter()
{
	return 2*(Length+breadth);
	
}


public static void main(String[] arg)
{
	Rectangle rect=new Rectangle(5,9);
	System.out.println(rect.Length);
	System.out.println(rect.breadth);
	System.out.println(rect.getArea());
	System.out.println(rect.getPerimeter());
	
			
	}

}