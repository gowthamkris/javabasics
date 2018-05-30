package opertor1;

public class Multipulication {
int g;
int s;
int r;
public void isMulti(int g,int s)
{
	if(g%s==0)
	{
		System.out.println("true");
		
	}
	else
	{
		System.out.println("false");
	}
}
	public static void main(String args[])
	{
		Multipulication m1=new Multipulication();
		m1.isMulti(6, 3);
	}

}
