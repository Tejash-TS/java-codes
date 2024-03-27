import java.io.*;
class vow
{
public ststic void main(String ar[])
{
DataInputStream d=nem DataInputStream(System.in)
System.out.println("enter string:");
String s=d.readLine();
int cnt=0;
int l=s.length();
char ch;
for(int i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
cnt++;
}
System.out.println("No of voveks:"+cnt);
}
}
