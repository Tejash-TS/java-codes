import java.util.*;

class Bank
{
public
int code;
String Bname;
Scanner s=new Scanner(System.in);
void putB()
{
System.out.println("enter bank name=");
Bname=s.next();
System.out.println("enetr code");
code=s.nextInt();
}
void getB()
{
System.out.println("enter bank name="+Bname);
System.out.println("enetr code"+code);
}
}

interface Loan 
{
public void putC();
}


class Cust extends Bank implements Loan
 
{
public
double roi,amt;
int No,id;
String name;
Scanner s=new Scanner(System.in);
public void putC()
{
System.out.println("enter id");
id=s.nextInt();
System.out.println("enter name=");
name=s.next();

System.out.println("enter amount");
amt=s.nextDouble();
System.out.println("enter roi");
roi=s.nextDouble();
System.out.println("enter loan no");
No=s.nextInt();
}
void getL()
{
System.out.println("enter id="+id);
System.out.println("enter name="+name);
System.out.println("enter amount="+amt);
System.out.println("enter roi"+roi);
System.out.println("enter no"+No);
}

public static void main(String args[])
{
Cust r= new Cust();
r.putB();
r.getB();
r.putC();
r.getL();

}
}

