import java.util.*;

class Ber extends Exception
{
Ber(String B)
{
super(B);
}
}
class Bust
{
String name,Bname;
int age;
int amt, BBalance=10000;
Scanner s= new Scanner(System.in);

public void get()
{
System.out.println("enter name");
name=s.next();
System.out.println("enter age");
age=s.nextInt();
System.out.println("amount");
amt=s.nextInt();
System.out.println("Bank name");
Bname=s.next();


try
{
if(amt>BBalance)
{
throw new Ber("amount not present");
}
else
{
System.out.println("______customer details_____");
System.out.println("______Customer bank:"+Bname);
System.out.println("______Customer name:"+name);
System.out.println("______Customer age:"+age);
System.out.println("______customer bank balance:"+BBalance);
System.out.println("______Customer amount to be withdraw"+amt);

}
}
catch(Ber e)
{
System.out.println("caught Exception"+e);
}
}
public static void main(String ar[])
{
Bust c=new Bust();
c.get();
}
}