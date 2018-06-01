package basic;

public class Command {
public static void main(String args[])
{
int i;
double sum=0;
for(i=0;i<5;i++)
{
	sum=sum+Double.parseDouble(args[i]);
}
System.out.println(sum);

}

}