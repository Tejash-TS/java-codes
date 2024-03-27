import java.io.*;
class Student3
{
String name;
int rn;
DataInputStream d= new DataInputStream(System.in);
void get() throws Exception
{
System.out.println("enter roll no");
rn=Integer.parseInt(d.readLine());
System.out.println("enter Name");
name=d.readLine();
}
void out()throws Exception
{
System.out.println("Roll no:"+rn);
System.out.println("name:"+name);
}
}
class Library extends Student3
{
int mn;
DataInputStream di=new DataInputStream(System.in);
void in() throws Exception
{
get();
System.out.println("enter member no;");
mn=Integer.parseInt(di.readLine());
}
void show() throws Exception
{
out();
System.out.println("element no"+mn);
}
}
class s1
{
public static void main(String ar[]) throws Exception
{
Library l=new Library();
l.in();
l.show();
}
}
