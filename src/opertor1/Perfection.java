package opertor1;

public class Perfection {
int g;
int s=0;
public void isPerfection(int g)
{
	for(int j=1;j<g;j++)
	{
		if(g%j==0)
		{
			s=s+j;
		}
	}
	if(s==g)
	{
		System.out.println("given number is perfection");
		
	}
	else
	{
		System.out.println("given number is not perfection");
	}
}
public static void main() {
	Perfection p=new Perfection();
	p.isPerfection(6);
}
}
