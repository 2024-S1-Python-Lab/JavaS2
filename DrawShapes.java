import java.applet.Applet;
import java.awt.*;
/*
<applet code="DrawShapes" width="300" height="300"></applet>
*/
public class DrawShapes extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.GREEN);
g.drawLine(50,200,300,200);
g.setColor(Color.RED);
g.drawRect(50,50,150,100);
g.setColor(Color.BLUE);
g.drawOval(250,50,100,100);
}
}