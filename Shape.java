import java.util.*;
class shape
{
static float pi=3.14f;
int r;
Scanner s=new Scanner(System.in);
void area() 
{
System.out.println("enter radious;");
r=s.nextInt();
float Ac=pi*r*r;
System.out.println("Area of circlr:"+Ac);
}
void area(int si)
{
int as=si*si;
System.out.println("Are of squr:"+as);
}
public static void main(String ar[]) throws Exception
{
shape S=new shape();
S.area();
S.area(5);
}
}



