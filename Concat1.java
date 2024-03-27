import java.io.*;
class Concat
{
public static void main(String ar[])
{
FileInputStream f1=null;
FileInputStream f2=null;

SequenceInputStream f3=null;

f1=new FileInputStream("text.dat");
f2=new FileInputStream("text2.dat");

f3=new SequenceInputStream(f1,f2);
BufferedInputStream inb=new BufferedOutputStream(f1);
BufferedInputStream outb=new BufferedOutputStream(System.out);
int ch;
while((ch=inb.read())!=-1)
     outb.write((char)ch);
try
{
inb.close();
outb.close();
f1.close();
f2.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}