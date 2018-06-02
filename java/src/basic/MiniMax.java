package basic;

public class MiniMax {
	int a[]= {3,4,5,2,33,24,1};
	public void Max()
	{
		int s=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>s)
			{
				s=a[i];
			}
		}
		System.out.println("Maximum ");
		System.out.println(s);
	}
	public void Min()
	{
		int s=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s)
			{
				s=a[i];
			}
		}
		System.out.println("Minimum ");
		System.out.println(s);
	}
public static void main(String a[])
{
	MiniMax m1=new MiniMax();
	m1.Max();
	m1.Min();
}
}
