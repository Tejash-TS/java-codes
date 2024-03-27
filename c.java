import java.io.*;
class c
{
public static void main(String ar[])

{
FileInputStream inf=null;
int b;
try
{
inf=new FileInputStream("abc.txt");
while((b=inf.read())!=-1)
System.out.print((char)b);
inf.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}
