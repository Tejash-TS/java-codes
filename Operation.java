import java.util.*;
class Operation
{
public static void main(String args[])
{
String s;
StringBuffer s2;
int x;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the string:");
s=s1.next();

s2=new StringBuffer(s);
s2.setCharAt(1,'x');
System.out.println("string="+s2);

}
}





