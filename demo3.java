class Student
{
int m;
void getno(int n)
{
m=n;
}
void puton()
{
System.out.print("roll no:"+rn);
}
}
class Test extends Student
{
int s1,s2;
void getm(int m1,int m2)
{
s1=m1;
s2=m2;
}
void putm()
{
System.out.println("sub1 marks:"+s1);
System.out.println("sub2 marks:"+s2);
}
}
interface Sport
{
float Sportwt=6.0f;
void putwt();
}
class Result extends Test implements Sport
{
float total;
public void putwt()
{
System.out.ptintln("sportwt:"+sportwt);
}
void display()
{
total=s1+s2;
puton();
putm();
putwt();
System.out.println("Total marks mark:"+total);
}
}
class Demo3
{
public static void main(String args[])
{
Result r= new Result();
r.getno(2);
r.getm(80,65);
r.display();
}
}

