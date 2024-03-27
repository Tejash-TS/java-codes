import java .io.*;
class Circle
{
public static void main(String args[])throws IOException
{

double r,A;
DataInputStream dl= new DataInputStream(System.in);
System.out.println("enter value for r");
r=Double.parseDouble(dl.readLine());
A=r*r*3.14;
System.out.println("area of circle="+A);
}
}

