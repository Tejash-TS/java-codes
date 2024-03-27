import java.util.*;
class Array
{
public static void main(String args[])
{
int a[]=new int[10];
int i,n;
Scanner s=new Scanner(System.in);
System.out.println("enter value for n");
n=s.nextInt();
for(i=0;i<n;i++)
{
 a[i]=s.nextInt();
}
System.out.println("\n Array elements");
for(i=0;i<n;i++)
System.out.println(+a[i]);
}
}