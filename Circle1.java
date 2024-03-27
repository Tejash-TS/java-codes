abstract class Shape
{
abstract void area();
}
class Rect extends Shape
{
  void area()
{
int l=12,b=10,A;
A=l*b;
System.out.println("area of rectangle="+A);
}
}
class Circle1 extends Shape
{
void area()
{
int r=10;
double Ar;
Ar=3.14*r*r;
System.out.println("area of circle="+Ar);
}
public static void main(String args[])
{
Circle1 C=new Circle1();
C.area();
Rect r1=new Rect();
r1.area();
}
}

