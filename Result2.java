import java.util.*;

class Bank
{
public
int code;
String Bname;
scanner s=new Scanner(System.in);
void putB()
{
System.out.println("enter bank name=");
Bname=s.next();
System.out.println("enetr code");
code=s.next();
}
void getB()
{
System.out.println("enter bank name="+Bname);
System.out.println("enetr code"+code);
}
}
interface Loan 
{
int id;
String name;

void putC();
}


class Cust extends Bank implements Loan
 
{
public
float roi,amt;
int No;
scanner s=new Scanner(System.in);
void putC()
{
System.out.println("enter id");
id=s.nextInt();
System.out.println("enter name=");
name=s.next();

System.out.println("enter amount");
amt=s.next();
System.out.println("enter roi");
roi=s.next();
System.out.println("enter no");
No=s.nextInt();
}
void getL()
{
System.out.println("enter id="+id);
System.out.println("enter name="+name);
System.out.println("enter amount="+amount);
System.out.println("enter roi"+roi);
System.out.println("enter no"+No);
}
}



public static void main(String args[])
{
Cust r= new Cust();
r.putB();
r.getB();
r.getL();
r.putL();
r.putC();
r.putC();
}
}

