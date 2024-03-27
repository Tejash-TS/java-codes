import java.util.*;

class F
{
public ststic void main(String ar[])
{
File inf=new File("input.lab);
File outf=new File("input.lab);
FileReades ins =null;
FileWriter outs=null;
try
{
int =new .FileReader(inf);
outs=new Fileworks(outs);
int ch;
while((ch=ins.read())!=-l)
outs.write(ch);
catch(IOException e)
{
System.out.println(e);
}
finally
{
try
{
ins.close();
outs.close();
}
catch(IOException e)
}
}
}
