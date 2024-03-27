import java.io.*;
class f
{
public static void main(String ar[])
{
byte c[]={ 'P','U','N','E','\n','N','A','S','H','I','K','\n','M','U','M','B','A','I','\n'};
FileOutputStream outf=null;
try
{ 
outf=new FileOutputStream("city.txt");
outf.write(c);
outf.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}
