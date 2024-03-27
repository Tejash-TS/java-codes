import java.io.*;
class demo
{
public static void main(String ar[])throw Exception
{
DataInputString d=new DataInputStream(System.in);
System.out.println("enter string:");
String s=d.readLine();
int cnt=0;
int l=s.length();
char ch;
for l=s.length();
char ch;
for(int i=0;i<l;,i++)
{
ch=charAt(i);
if (ch>='0'&&ch<='9')
cnt++;
}
System.out.println("NO of digits String:"+cnt);
}
}