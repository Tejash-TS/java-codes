import java.awt.*;
import java.applet.*;

public class expl extends Applet
{
Textfield t1,t2;
TextArea tal;
Label L1,L2;
heckbox c1,c2,c3,c4;
CheckboxGrup c9;
Scrollbar s1,s2;
Button b1,b2;
pubblic void init()
{
t1=new Textfield(20);
t2=new Textfield(20);
tal=new TextArea(4,20);
l1=new Lable("enter rollno");S
l2=new Lable("enter name");
c1=new Checkbox("chess");
c2=new Chckbox("hocky");
c9=new Checkbox Grupe();
c3=new Checkbox("make",c9,true);
c4=new Checkbox("female ,c9,false);

s1=new Scrollbar(Scrollbar.VERTICAL,10,10,1,500);
s2=new Scrollbar(Scrollbar.HORIZONTAL,1,10,10,1,700);
ch=new choice();
ch=addItem("Mumbai");
ch.addItem("pune");
b1=new Button("KO");
b2=new Button("cancle");
add(t1);
add(t2);
add(tal);
add(l1);     add(l2);    add(c1);            
add(c2);     add(c3);    add(c4);
add(s1);     add(s2);    add(ch);
add(b1);     add(b2);     
}
}
