import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="Demo.class"width="500" height="500"><\applet>
public class Demo extends Applet implements MouseMotionListener
{
  String msg=" ";
  public void init()
  {
    addMouseMotionListener(this);
  }
   public void mouseMoved(MouseEvent me)
   {
     msg="MouseMoved";
     repaint();
   }
    public void mouseDragged(MouseEvent me)
    {
      msg="MouseDragged";
    }
      public void paint(Graphics g)
       {
         Font f=new Font("Times New Roman",f.BOLD,25);
         g.setFont(f);
         g.drawString(msg,100,100);
       }
}
     
  