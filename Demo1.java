import java.io.*;
class Demo1
{
public static void main(String ar[])
{
RandomAccessFile F=null;
try
{
f=new RandomAccessFile("in.dat","rw");

f.openChar('X');
f.writInt(55);
f.writDouble(3.14);
f.Seek(0);
System.out.println(f.readChar());
System.out.println(f.readInt());
System.out.println(f.readDouble());


f.seek(f.length());
f.writeBoolen(false);
f.seek(4);
System.out.println(f.readBoolean());
f.close();
}
catch(IOException e)
}
}
}

