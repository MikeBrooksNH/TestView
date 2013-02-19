import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Color;
public class TextThree extends java.applet.Applet
{
private String string;
private Font font;
private Rectangle rectangle;
public void init() {
string = "Bottom Right";
rectangle = getBounds();
font = new Font("TimesRoman",Font.ITALIC,22);
setBackground(Color.red);
}
public void paint(Graphics g) {
int x;
int y;
FontMetrics fm = g.getFontMetrics(font);
x = rectangle.width;
x -= fm.stringWidth(string);
y = rectangle.height;
y -= fm.getDescent();
g.setFont(font);
g.setColor(Color.white);
g.drawString(string,x,y);
}
}


