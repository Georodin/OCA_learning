package ml.schulzke.adventure.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GuiMain {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(640,480);
		f.setTitle("Mein tolles Programm!");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	      Image image = null;
	      File file = new File("src/ml/schulzke/adventure/gui/mapEnd.jpg");
	      JLabel picLabel = null;
	      try {
		      BufferedImage myPicture = ImageIO.read(file);
		      picLabel = new JLabel(new ImageIcon(myPicture));
	      } catch(IOException ioe) {
	         JOptionPane.showMessageDialog(null,
	            "Das Hintergrundbild konnte nicht geladen werden!\n" + ioe.getLocalizedMessage(),
	            ioe.getClass().getName(),
	            JOptionPane.WARNING_MESSAGE);
	      }
	      
	      
	      // create a line border with the specified color and width
	        Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
	 
	        // set the border of this component
	        picLabel.setBorder(border);
	        
	        
	      f.add(picLabel);
	      f.setVisible(true);
	      
	}
	


	

}
