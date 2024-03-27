import java.util.*;
class myer extends Exception
{
myer(String m)
{
super(m);
}
}
class emp
{
String name;
int age;

public void get()
{
Scanner s=new Scanner(System.in);
System.out.println("enter name:");
name=s.nex();

System.out.println("enter age");
System.out.println("_____Employee Record______");
age=s.nextInt();

if(age<0)
{
throw new myer("Invalid age");
}
}
catch(Exception e)
{
System.out.println("caught Exception");
}
public static void main(Strig ar[])
{
emp e= new emp();
e.get();
}
}
