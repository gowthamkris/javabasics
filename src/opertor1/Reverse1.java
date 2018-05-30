package opertor1;

public class Reverse1 {
int g;
public void reverse(int g)
{
	int s=0;
	while(g!=0)
	{
		s=s*10;
		s=s+g%10;
		g=g/10;
	}
	System.out.println(s);

}
public static void main(String args[])
{
	Reverse1 r1=new Reverse1();
	r1.reverse(1523);
	
}
}
