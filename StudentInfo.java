import java.util.*;
class StudentInfo
{
String name;
int marksM,marksE,marksS,marksH,rollNo,per;
Scanner s=new Scanner(System.in);
void get() throws Exception
{
System.out.println("enter name=");
name=s.next();
System.out.println("enter roll no:");
rollNo=s.nextInt();
System.out.println("enter marks of eng:");
marksE=s.nextInt();
System.out.println("enter marks of maths:");
marksM=s.nextInt();
System.out.println("enter marks of hindi:");
marksH=s.nextInt();
System.out.println("enter marks of science:");
marksS=s.nextInt();
per=(2marksM+marksE+marksS+marksH)/4;
System.out.println("parcentage="+per);
}
void show()
{
System.out.println("student having high percentage");
System.out.println("name:"+name);
System.out.println("percentage:"+per);
}
public static void main(String args[])throws Exception
{
StudentInfo S[]=new StudentInfo[5];
for(int i=0;i<2;i++)
 S[i]=new StudentInfo();
for(int i=0;i<2;i++)
S[i].get();
int j=0;
int max=S[0].per;
for(int i=0;i<2;i++)
{
if(max<S[i].per)
{
max=S[i].per;
j=i;
}
}
S[j].show();
}
}




