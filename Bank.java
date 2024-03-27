import java.util.*;
class Bank
{
String name;
int balabce;

static String BName;
static int id;
static int counter=0;

public Bank(String name)
{
this.name=name;
this.id=setid();
}
static int setid()
{
couter++;
return counter;
}
static void setBName(String name)
{
BName=name;
}
void getBankDetails()
{
System.out.println("Enter bank balance");
balance=s.nextInt();
System.out.println("bank id="+id);
System.out.println("cust name="+name);
System.out.println("bank name="+BName);
System.out.println("bank balance="+balance);
}

}
public class StaticBn
{
public static void main(String args[])
{

String name1;
Bank.setBName("sbi");
Scanner s=new Scanner(System.in);
System.out.println("enter name=");
name1=s.next();
Bank b1=new Bank(name1);
b1.getBankDetails();
System.out.println("ente name=");
name1=s.next();

Bank b2=newBank(name1);
b2.getBankDetails();
System.out.println("enter name=");
name1=s.next();
}
}