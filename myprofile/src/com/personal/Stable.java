package com.personal;




public class Stable {
    static int c=0;
    static int d=0;
    static int password=0;
	public void findpassword(int a,int b,int c,int d,int e)
{ 
	show(a);
	show(b);
	show(c);
    show(d);
	show(e);
	//int p=p1+p2+p3+p4+p5;
//	return p;
}
public static void show(int x){
String s=String.valueOf(x);
String a="";
// password=0;
int count=0;
for(int i=0;i<s.length();i++)
{
for(int j=0;j<s.length();j++)
{
if(s.charAt(i)==s.charAt(j))
{ 
if(i!=j)
{
	count=1;
a += s.charAt(i); 
}
}
}
}
if(count==0)
{
	//return password;
	c+=1;
}
else
{

if(a.equals(s)==true)
{ 
//return password;
c+=1;
}
else
{
//password=Integer.parseInt(s);
//return password;
d+=1;
}
}
password=(d*10)+c;
}
//password=(d*10)+c;


public static void main(String[] args) {
	Stable s=new Stable();
 s.findpassword(1313,12,122,678,898);
 System.out.println(password);
}
}


