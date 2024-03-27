import java.util.*;
class Error
{
void arr() throws ArithmeticException
{
int a[]=new int[5];
int i;
int n=6;
Scanner s=new Scanner(System.in);
if(n>5)
{
throw new ArithmeticException("grater than size of array");
}
else
{
System.out.println("enter value of element");
for(i=0;i<n;i++)
{
 a[i]=s.nextInt();
}
System.out.println("\n array element");
for(i=0;i<n;i++)
{
System.out.println(+a[i]);
}
}
}
public static void main(String ar[])
{
try
{
Error e1=new Error();
e1.arr();
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}



