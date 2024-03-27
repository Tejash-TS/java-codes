import java.io.*;
class Buffer
{
public static void main(String args[])throws Exception
{
int x;
String str,str1;
DataInputStream d=nem DataInputStream(System.in);
System.out.println("enter string:");
str=d.readLine();
x=str.length();
int j=0,i,f=0;
char ch,c;
for(i=1-1;i>=0;i--)
{
if (i!=j)
{
ch=str.charAt(i);
c=str.charAt(j);
if(ch==c)
{
i++;
}
else 
break;
}
}
if (i==j-1)
System.out.print("string is not palindram");
}
}
