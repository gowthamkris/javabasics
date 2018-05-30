package opertor1;

public class DateMonth {
int Day1;int month1;
int year;
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
	System.out.println(year);
}
public void displayDateMonth(int Day1,int month1,int year)
{
	System.out.println("Date is "+Day1+"/"+month1+"/"+year+"");
	
	}
public static void main(String args[]) {
	DateMonth dm=new DateMonth();
	dm.displayDateMonth(30,11,1997);
	dm.displayDateMonth(15, 03, 1997);
}
}
