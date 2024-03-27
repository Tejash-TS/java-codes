class student
{
public static void main(String args[])
{

int eng=90,rollno=117,maths=80,phy=78,chem=88,per;
String name="tejash";
System.out.println(" name="+name);
System.out.println("roll_no="+rollno);
System.out.println("marks of eng="+eng);
System.out.println("marks of maths="+maths);
System.out.println("marks of physics="+phy);
System.out.println("marks of chemistry="+chem);

per=(eng+maths+phy+chem)/4;
System.out.println("percentage is="+per);

if(per>90)
System.out.println("grade is A");
else if(per>70)
System.out.println("grede is B");
else if(per>50)
System.out.println("grade is c");
else
System.out.println("fail");

}
}