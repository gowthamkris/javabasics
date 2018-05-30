package opertor1;

public class PassByRefer {
	String p_no1;
	String p_des;
	int p_qua;
	double p_price,total;
	
	
	public String getP_no() {
		return p_no1;
	}


	public void setP_no(String p_no) {
		this.p_no = p_no;
	
	}


	public String getP_des() {
		return p_des;
		
	}


	public void setP_des(String p_des) {
		this.p_des = p_des;
		System.out.println(p_des);
	}


	public int getP_qua() {
		return p_qua;
	}


	public void setP_qua(int p_qua) {
		this.p_qua = p_qua;
				System.out.println(p_qua);
	}


	public double getP_price() {
		return p_price;
	}


	public void setP_price(double p_price) {
		this.p_price = p_price;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(int P_qua,double p_price) {
		this.total = P_qua * p_price;
				System.out.println( "total bill sold is "+total+"");
	}


	public static void main(String args[]) {
		PassByRefer p1= new PassByRefer();
		p1.setP_des("biscut");
		p1.setTotal(5,50.232);
		
	}
}

