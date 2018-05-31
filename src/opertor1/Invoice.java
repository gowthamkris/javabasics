package opertor1;

public class Invoice {
public static void main(String[]args)
{
	PassByRefer rf=new PassByRefer();
	rf.setP_qua(5);
	rf.setP_price(100);
	System.out.println(rf.getP_qua());
	System.out.println(rf.getTotal());
	
}
}
