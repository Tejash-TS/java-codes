import java.util.*;
class Traingle
{
int l,b,h;
Scanner s=new Scanner(System.in);
void area()
{
System.out.println("enter value  l");
l=s.nextInt();
System.out.println("enter value of b");
b=s.nextInt();
System.out.println("enter value of h");
h=s.nextInt();
int ar= l*b;
System.out.println("area of rtecteangle="+ar);
}
void Area()
{
float At=(b*h)/2;
System.out.println("area of traingle="+At);
}
public static void main(String args[])
{
Traingle T=new Traingle();
T.area();
T.Area();
}
}