package opertor1;

public class DateMonth {
int Day1;int month1;
int year;
public DateMonth()
{
	
}
public DateMonth(int Day1,int month1,int year)
{
	this.Day1=Day1;
	this.month1=month1;
	this.year=year;
}
public int getDay1() {
	return Day1;
	
}
public void setDay1(int Day1) {
	this.Day1=Day1;
}
public int getmonth1() {
	return month1;
}
public void setmonth1(int month1)
{
	this.month1=month1;
}
public int getyear()
{
	return year;
}
public void setyear(int year)
{
	this.year=year;
	//System.out.println(year);
}
public void displayDateMonth()
{
	System.out.println("Date is "+Day1+"/"+month1+"/"+year+"");
	
	}
public static void main(String args[]) {
	DateMonth dm=new DateMonth();
	dm.setDay1(31);
	dm.setmonth1(11);
	dm.setyear(1997);
	dm.displayDateMonth();
	//dm.displayDateMonth(30,11,1997);
	
	
}
}
