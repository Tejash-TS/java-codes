class Num
{
public int x,y,z;
Num()
{
x=2;
y=5;
}
Num(int a,int b)
{
x=a;
y=b;
}
Num(Num N)
{
x=N.x;
y=N.y;
}
void add()
{
z=x+y;
System.out.println("addition="+z);
}
public static void main(String args[])
{
Num N1=new Num();

N1.add();
Num N2= new Num(12,13);
N2.add();
Num N3=new Num();
N3.add();
}
}