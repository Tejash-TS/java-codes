import java.util.*;

class employee
{
public
 String name,city;
 int age ,sal;
Scanner s= new Scanner(System.in);
public void get()
{
System.out.println("enter the name");
name=s.next();
System.out.println("enter city");
city=s.next();
System.out.println("enter age");
age=s.nextInt();
System.out.println("enter sal");
sal=s.nextInt();
}
public void show()
{
System.out.println("name="+name);
System.out.println("city="+city);
System.out.println("age="+age);
System.out.println("sal="+sal);
}
public static void main(String args[])
{
employee E1= new employee();
E1.get();
E1.show();
}
}

