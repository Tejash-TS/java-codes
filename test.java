import java.util.*;
interface area
{
final static float pi=3.14f;
void calculate();
}

class Rectangle implements area
{
int l,b;
Scanner s=new Scanner(System.in);
public void calculate()
{
System.out.println("enter length");
l=s.nextInt();
System.out.println("enetr breadth:");
b=s.nextInt();
int ar=l*b;
System.out.println("Area of rectangle="+ar);
}
}

class Circle implements area
{
float r;

Scanner s=new Scanner(System.in);
public void calculate()
{
System.out.println("enter radious");
r=s.nextInt();
float ac=pi*r*r;
System.out.println("Area of circle:"+ac);
}
}


class test
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
area a;
a=r;
a.calculate();
Circle c=new Circle();
a=c;
a.calculate();
}
}
