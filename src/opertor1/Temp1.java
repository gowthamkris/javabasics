package opertor1;

public class Temp1 {
double deg;
double celsius,fahrenheit;
public void celsius(double deg) {	

deg=fahrenheit;
celsius=5.0/9.0*(fahrenheit-32);
System.out.println("Celsius:"+celsius+"");
}
public void fahrenheit(double deg)
{
	deg=celsius;
	fahrenheit=9.0/5.0*celsius+32;
	System.out.println("Fahrenheit:"+fahrenheit+"");
	System.out.println();
	}
public static void main(String args[]) {
	Temp1 t=new Temp1();
	Temp1 t1=new Temp1();
	t.celsius(43);
	t1.fahrenheit(90);
	
	
	
}
}
