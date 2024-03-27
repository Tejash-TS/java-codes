Class QS
{
public void dst()
{
System.out.println("I am a Quadrilateral");
}
}
class RS extends QS
{
public void displayRT()
{
Sytem.out.println("I am rectangle");
}
public void displayShapeTypes()
{
displayRT();
super.dst();
}
}
class Main1
{
public static void main(String args[])
{
RectaangularShape r=new RectangularShape();
r.displayShapeType();
}
}