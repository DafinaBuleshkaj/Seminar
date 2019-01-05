import java.awt.*;
import javax.swing.*;

/** BarGraphWriter writes a class that displays  
up to 6 separate bars for every month in the year */
public class BarGraphWriter extends JPanel
{ 
   
   private int x_position;
   private int y_position;
   private int width = 400; // the frame's width
   private int height = 200; // the frame's height
   private int thick = 25; // thickness of bars and shadows
   private int barDistance = 32; // distance between bars 
   private int d1 = barDistance;
   private int d2 = d1 + 5; // distance between shadows
   
   Graphics g ;
   JFrame my_frame;
   
   /** BarGraphWriter constructs the window. */
   public BarGraphWriter()
   {
      my_frame = new JFrame();
      my_frame.getContentPane().add(this);
      my_frame.setSize(width, height);
      my_frame.setVisible(true);
   } 
   
   public void setTitle(String title)
   {
      my_frame.setTitle(title);
   }
   
   public void paintComponent(Graphics g)
   {
      g.setColor(Color.white);
      g.fillRect(0, 0, width, height); 
   }
  
   // setAxes draws the x- and y-axes of the graph.
   public void setAxes(int x_pos, int y_pos, String top_label, int y_height)
   {
      g = this.getGraphics();
      this.x_position = x_pos;
      this.y_position = y_pos;
      g.setColor(Color.black);
      
      // top label
      g.drawString(top_label, x_position-15, y_position - y_height+5);
      // bottom label
      g.drawString("0", x_position-15, y_position);
      // x-axis
      g.drawLine(x_position, y_position, x_position + 6*32 + 5, y_position);
      // y-axis
      g.drawLine(x_position, y_position-y_height, x_position, y_position);
   }
     
     // setBar1 draws the first bar in the graph for January
   public void setBar1(String label, int height, Color c)
   {
      g.setColor(Color.black);
      g.drawString(label, x_position, y_position + 17);
      g.fillRect(x_position + 5, y_position - height + 5, thick, height);
      g.setColor(c);
      g.fillRect(x_position, y_position - height, thick, height);
      g.setColor(Color.black);
      g.drawRect(x_position, y_position - height, thick, height);
   }
   
   // setBar2 draws the second bar in the graph for February
   public void setBar2(String label, int height, Color c)
   {
      g.setColor(Color.black);
      g.drawString(label, x_position + d1, y_position + 17);
      g.fillRect(x_position + (d1 + 5), y_position - height + 5, thick, height);
      g.setColor(c);
      g.fillRect(x_position + d1, y_position - height, thick, height);
      g.setColor(Color.black);
      g.drawRect(x_position + d1, y_position - height, thick, height);
   }
   
   // setBar3 draws the third bar in the graph for Mars
   public void setBar3(String label, int height, Color c)
   {
      g.setColor(Color.black);
      g.drawString(label, x_position + (d1 * 2) , y_position + 17);
      g.fillRect(x_position + (d1 * 2) + 5, y_position - height + 5, thick, height);
      g.setColor(c);
      g.fillRect(x_position + (d1 * 2), y_position - height, thick, height);
      g.setColor(Color.black);
      g.drawRect(x_position + (d1 * 2), y_position - height, thick, height);  
   }
   
   // setBar4 draws the fourth bar in the graph for April
   public void setBar4(String label, int height, Color c)
   {      
      g.setColor(Color.black);
      g.drawString(label, x_position + (d1 * 3), y_position + 17);
      g.fillRect(x_position + (d1 * 3) + 5, y_position - height + 5, thick, height);
      g.setColor(c);
      g.fillRect(x_position + (d1 * 3),y_position - height, thick, height);
      g.setColor(Color.black);
      g.drawRect(x_position + (d1 * 3), y_position - height, thick, height);
   }
   
   // setBar5 draws the fifth bar in the graph for May
   public void setBar5(String label, int height, Color c)
   {     
      g.setColor(Color.black);
      g.drawString(label, x_position+ (d1 * 4), y_position + 17);
      g.fillRect(x_position + (d1 * 4) + 5, y_position - height + 5, thick, height);
      g.setColor(c);
      g.fillRect(x_position + (d1 * 4), y_position - height, thick, height);
      g.setColor(Color.black);
      g.drawRect(x_position + (d1 * 4), y_position - height, thick, height);
   }
   
   // setBar6 draws the sixth bar in the graph for June
   public void setBar6(String label, int height, Color c)
   { 
      g.setColor(Color.black);
      g.drawString(label, x_position + (d1 * 5), y_position + 17);
      g.fillRect(x_position + (d1 * 5) + 5, y_position - height + 5, thick, height);
      g.setColor(c);
      g.fillRect(x_position + (d1 * 5), y_position - height, thick, height);
      g.setColor(Color.black);
      g.drawRect(x_position + (d1 * 5), y_position - height, thick, height); 
   }
}

   