import java.awt.*;
public class choice11
{
public static void main(String a[])
{
Frame frame;
Panel p1;
Choice ch;
frame= new Frame("My Frame");
frame.setVisible(true);
frame.setSize(300,300);
p1=new Panel();
frame.add(p1);
ch=new Choice();
ch.addItem("choice 1");
ch.addItem("choice 2");
ch.addItem("choice 3");
p1.add(ch);
}
}
