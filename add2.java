import java.util.*;
class A
{
int a;
Scanner s=new Scanner(System.in);
void get() 
{
System.out.println("enter No");
a=s.nextInt();
}
}

class B extends A
{
int b;
Scanner s=new Scanner(System.in);
void get2()
{
System.out.println("enter NO");
b=s.nextInt();
}
}

class add2 extends B
{
int Add;
void sum()
{
Add=a+b;
System.out.println("sum="+Add);
}
public static void main(String args[])
{
add2 a1=new add2();
a1.get();
a1.get2();
a1.sum();
}
}






