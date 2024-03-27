import java.util.*;
class Student_info
{
int rn,m1,m2,t;
String n;
Scanner s=new Scanner(System.in);
void get()
{
System.out.println("enter roll no:");
rn=s.nextInt();
System.out.println("enter name");
n=s.next();
System.out.println("Enter marks of sub 1:");
m1=s.nextInt();
System.out.println("enter marks of sub2");
m2=s.nextInt();
}
void disp()
{
System.out.println("roll No"+rn);
System.out.println("name:"+n);
System.out.println("marks of sub1:"+m1);
System.out.println("marks of sub2:"+m2);
t=m1+m2;
System.out.println("total mrks:"+t);
}
}
class Avg extends Student_info
{
float a;
void avg()
{
get();
disp();
a=t/2;
System.out.print("Average:"+a);
}
}
class Result extends Avg
{
void cal()
{
avg();
if(a>=75)
System.out.println("istiaction");
if((a>=60)&&(a<75))
System.out.println("first class");
if((a>=50)&&(a<60))
System.out.println("Second class");
if((a>=35)&&(a<50))
System.out.println("pass");
if(a<35)
System.out.println("fail");
}
}
class info
{
public static void mib(String ar[])
{
Result r=new Result();
r.cal();
}
}
