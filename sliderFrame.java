
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class sliderFrame extends JFrame 
{
   private final JSlider diameterJSlider;
   private final theArc myPanel;
  
   public sliderFrame() 
   {
      super("Slider Demo");

      myPanel = new theArc(); 
      myPanel.setBackground(Color.pink); 
  
      diameterJSlider = 
         new JSlider(SwingConstants.HORIZONTAL, 0, 360, 0);
      diameterJSlider.setMajorTickSpacing(30);
      diameterJSlider.setPaintTicks(true); 
      diameterJSlider.setMinorTickSpacing(1);
      diameterJSlider.setPaintTicks(true);
      diameterJSlider.setPaintLabels(true);

      diameterJSlider.addChangeListener(
         new ChangeListener() 
         {  
            @Override
            public void stateChanged(ChangeEvent e)
            {
            	 myPanel.setArc(diameterJSlider.getValue());
            } 
         } 
      ); 

      add(diameterJSlider, BorderLayout.SOUTH); 
      add(myPanel, BorderLayout.CENTER); 
   } 
}