import java.awt.*;
public class TestPlanetGraph
{
   public static void main(String[] args)
   { 
      BarGraphWriter_v2 e = new BarGraphWriter_v2();
      e.setTitle("Planet Statistics");
      
      // BAR GRAPH 1
      
      e.setAxes(25, 120, "100", 100);      // x- and y-axes start at  25, 120
                // graph is 100 pixels high; top of graph is labelled "100"
      int scale_factor = 10;
      e.barTitle("Distance from Sun");  
      // Mercury is away from sun 0.387 astronomical units ..
      e.setBar1("Mercury", 0.387 * scale_factor, Color.red);  // etc.
      e.setBar2("Venus", 0.723 * scale_factor, Color.white); 
      e.setBar3("Earth", 1.00 * scale_factor, Color.blue);
      e.setBar4("Mars", 1.524 * scale_factor, Color.red);
      e.setBar5("Jupiter", 5.203 * scale_factor, Color.pink);
      e.setBar6("Saturn", 9.539 * scale_factor, Color.yellow);
      
      
      // BAR GRAPH 2 
      
      e.setAxes(370, 120, "100", 100);      // x- and y-axes start at  370, 120
                // graph is 100 pixels high; top of graph is labelled "100"
      int scale_factor1 = 80; 
      e.barTitle("Mass (relative to earth)"); 
      // Mercury mass is 0.05 relatively to Earth
      e.setBar1("Mercury", 0.05 * scale_factor1, Color.red); // etc.  
      e.setBar2("Venus", 0.81 * scale_factor1, Color.white); 
      e.setBar3("Earth", 1.00 * scale_factor1, Color.blue);
      e.setBar4("Mars", 0.11 * scale_factor1, Color.red);
      e.setBar5("Jupiter", 318.4 * scale_factor1, Color.pink);
      e.setBar6("Saturn", 95.3 * scale_factor1, Color.yellow);


     
     
      // BAR GRAPH 3
      
      e.setAxes(25, 300, "   3", 90);      // x- and y-axes start at  160, 300
                // graph is 90 pixels high; top of graph is labelled "3"
      int scale_factor2 = 30;
      e.barTitle("Weight of 1kg object"); 
      // 1 kg in Mercury weights 0.05 relatively to Earth
      e.setBar1("Mercury", 0.25 * scale_factor2, Color.red); // etc.
      e.setBar2("Venus", 0.85 * scale_factor2, Color.white); 
      e.setBar3("Earth", 1.00 * scale_factor2, Color.blue);
      e.setBar4("Mars", 0.36 * scale_factor2, Color.red);
      e.setBar5("Jupiter", 2.64 * scale_factor2, Color.pink);
      e.setBar6("Saturn", 1.17 * scale_factor2, Color.yellow);
      
      
      
      
       
       
   }
}