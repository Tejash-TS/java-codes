import java.util.*;
class A
{
public int x;
Scanner s=new Scanner(System.in);
void get()
{ 
System.out.println("enter value of x");
x=s.nextInt();
}
}
class B extends A
{
public 
int y,z;
Scanner s=new Scanner(System.in);
void add()
{
System.out.println("y=");
y=s.nextInt();
 z=x+y;
System.out.println("additio="+z);
}
public static void main(String ar[])
{
B b1=new B();
b1.get();
b1.add();
}
}

