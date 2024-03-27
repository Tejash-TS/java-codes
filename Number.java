import java.util.*;
class Number
{
public int x,y,z;
Scanner S= new Scanner(System.in);
public void get()
{
System.out.println("enter value for x and y");
x=S.nextInt();
y=S.nextInt();
}
public void add()
{
z=x+y;
System.out.println("\n addition="+z);
}
public static void main(String args[])
{
Number N1= new Number();
N1.get();
N1.add();
}
}