package com.personal;

public class Stableminmax {



    static int c1=0;
    static int d1=0;
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
//int password=0;
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
	if(x>c1)
	{
	    c1=x;
	}
}
else
{

if(a.equals(s)==true)
{ 
//return password;
//c+=1;
if(x>c1)
{
    c1=x;
}
    
}
else
{
//password=Integer.parseInt(s);
//return password;
if(password==0)
{
    d1=x;
    password++;
}
else{
    if(d1>x)
    {
        d1=x;
    }
}
}
}
}
//password=(d*10)+c;


//password=(d*10)+c;


public static void main(String[] args) {
	Stableminmax s=new Stableminmax();
 s.findpassword(1313,12,122,678,898);
 int n=c1+d1;
 System.out.println(n);
}
}


