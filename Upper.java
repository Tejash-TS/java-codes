import java.util.*;
class Upper
{
public static void main(String args[])
{
String s;
int x;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the string:");
s=s1.next();
System.out.println("string="+s);
String u=s.toUpperCase();
System.out.println("upper="+u);
String u2=s.toLowerCase();
System.out.println("lower="+u2);
x=s.indexOf("e");
System.out.println(x);
x=s.lastIndexOf("e");
System.out.println(x);
String p=s.substring(6);
System.out.println("sub="+p);
String m=s.substring(2,3);
System.out.println("sub="+p);
String l=s.trim();
System.out.println("sub="+p);



}
}