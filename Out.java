abstract class shape
{
abstract void area();
}
class rect extends shape
{
  void area()
{
int l=12,b=10,A;
A=l*b;
System.out.println("area of rectangle="+A);
}
}
class circle extends shape
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
circle C=new circle();
C.area();
}
}

