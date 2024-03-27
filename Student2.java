class student
{
public static void main(String args[])
{

int eng=90,rollno=117,maths=80,phy=78,chem=88,per,a=1;
String name="tejash";
System.out.println(" name="+name);
System.out.println("roll_no="+rollno);
System.out.println("marks of eng="+eng);
System.out.println("marks of maths="+maths);
System.out.println("marks of physics="+phy);
System.out.println("marks of chemistry="+chem);

per=(eng+maths+phy+chem)/4;
System.out.println("percentage is="+per);

if(per>=80)
 a=2;
if((per<80)&&(per>=60))
 a=3;
if((per<60)&&(per>=50))
 a=4;
if((per<50)&&(per>=40))
 a=5;
if(per<40)
 a=6;
switch(a)
{
case 2: System.out.println("distinction");
 break;
case 3: System.out.println("firstclass");
 break;
case 4: System.out.println("secondclass");
 break;
case 5: System.out.println("pass");
 break;
case 6: System.out.println("fail");
 break;
}
}
}