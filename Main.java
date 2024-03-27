class SuperClass
{
int A;

SuperClass()
{
A=5;
}
}
class SubClass extends SuperClass
{
int B;
SubClass()
{
B=super.A*2;
}
void displayVariables()
{
System.out.println("The value of A in superClass:"+super.A);
System.out.println("The value of B in superClass:"+B);
}
}
class Main
{
public static void main(String args[])
{
SubClass obj=new SubClass();
obj.displayVariables();
}
}