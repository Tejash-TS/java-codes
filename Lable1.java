import java.awt.*;
class Lable1
{
public static void main(String args[])
{
Frame frame;
Panel panel;
Lable l1;
frame=new Frame("my frame");
frame.setSize(500,700);
frame.setBackground(Color.red);
frame.setVisible(true);

panal=new Panal();

l1=new Lable ("nashik");
l2=new Lable ("mumbai");
l3=new Lable ("pune");

frame.add(panel);
panel.add(l1);
panel.add(l2);
panel.add(l3);
}
}