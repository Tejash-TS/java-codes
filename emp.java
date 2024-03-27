import java.util.*;
class emp
{
String n;
int sal;
Scanner d= new Scanner(System.in);
void get() throws Exception
{
System.out.println("Enter name:");
n=d.next();
System.out.println("Enter slary:");
sal=d.nextInt();
}
void show () 
{
System.out.println("employee having high salary");
System.out.println("name"+n);
System.out.println("salary:"+sal);
}
public static void main(String args[]) throws Exception
{
emp e[]=new emp[5];

for(int i=0;i<2;i++)
 e[i]=new emp();
for(int i=0;i<2;i++)
  e[i].get();
 int j=0;
 int max=e[0].sal;
for(int i=0;i<2;i++)
{
    if(max<e[i].sal)
{
        max=e[i].sal;
          j=i;
}
}
e[j].show();
}
}




