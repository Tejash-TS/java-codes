import java.awt.*;
class Frame1
{
public static void main(String args[])
{
Frame frame;
Panel panel;
Button button1,button2,button3;
frame=new Frame("My Frame");
frame.setSize(300,400);
frame.setBackground(Color.red);
frame.setVisible(true);
 

panel=new Panel();

button1=new Button("Button 1");
button2=new Button("Button 2");
button3=new Button("Button 3");

frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(button3);
}
}