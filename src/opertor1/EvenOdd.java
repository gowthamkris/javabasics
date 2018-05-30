package opertor1;

public class EvenOdd {
int i1=3;
public void Even(int i1)
{
	if(i1%2==0)
	{
		System.out.println("True");
	}
	else
	System.out.println("False");
}

public static void main(String args[])
{
	EvenOdd n=new EvenOdd();
	n.Even(9);
}
}

