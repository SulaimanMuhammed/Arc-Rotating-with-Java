import java.awt.*;

import javax.swing.*;

public class theArc extends JPanel {
	   int variable=0;
	  private int x ;
	 
	   @Override
	   public void paintComponent(Graphics g)
	   {
	      super.paintComponent(g);
	      Graphics2D g2d = (Graphics2D) g.create();
                  x = variable;
    	   //the first arc
	      g.setColor(Color.yellow);
	      g.fillArc(0, 0, 765, 685,x, -180);
	      // the second arc
	        g.setColor(Color.blue);
	      g.fillArc(0, 0, 765, 685, x, -90);
	      //the third arc
	      g.setColor(Color.green);
	      g.fillArc(0,0, 765, 685, x, 180);
	      //the forth arc
	      g.setColor(Color.red);
	      g.fillArc(0, 0, 765, 685, x, 90);
	      
	     
	      g2d.rotate(Math.toRadians(variable));
	   
	   }
	  
	public void setArc(int variable)
	   {
		   this.variable= variable;
   
           repaint();
	   } 
	
}
