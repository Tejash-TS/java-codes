class Students
{
int id;
String name;
String city;

Students(int id ,String name)
{
this.id=id;
this.name=name;
}
Students(int id,String name,String city)
{
this(id,name);
this.city=city;
}
void display()
{
System.out.println(id+" "+name+" "+city);
}

public static void main(String args[])
{
Students e1=new Students(111,"karan");
Students e2=new Students(222,"Aryan","delhi");
e1.display();
e2.display();
}
}

