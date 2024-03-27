import java.io.*;
class Search
{
public static void main(String args[])throws Exception
{
int a[]=new int[5];
int i,n,f=0;
DataInputStream d=new DataInputStream(System.in);
System.out.println("enter 5 elements:");
for(i=0;i<=4;i++)
a[i]=Integer.parseInt(d.readLine());
System.out.println("enter no to search:");
n= Integer.parseInt(d.readLine());
for (i=0;i<=4;i++)
{
if(a[i]==n)
{
f=1;
break;
}
}
if(f==1)
  System.out.println("no found at location="+i);
else
System.out.println("No not found");
}
}