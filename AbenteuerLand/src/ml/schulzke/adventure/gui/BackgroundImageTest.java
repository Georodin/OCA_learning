package ml.schulzke.adventure.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.net.*;

public class BackgroundImageTest {
   public BackgroundImageTest() {
      Dimension size = new Dimension(640,480);
      JFrame frame = new JFrame("BackgroundImage-Test");
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.add(createMainPanel());
      frame.setSize(size.width, size.height);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   private JPanel createMainPanel() {
      Image image = null;
      File f = new File("src/ml/schulzke/adventure/gui/mapEnd.jpg");
      try {
         image = ImageIO.read(f);
      } catch(IOException ioe) {
         JOptionPane.showMessageDialog(null,
            "Das Hintergrundbild konnte nicht geladen werden!\n" + ioe.getLocalizedMessage(),
            ioe.getClass().getName(),
            JOptionPane.WARNING_MESSAGE);
      }

      BackgroundImagePanel mainPanel = new BackgroundImagePanel(new BorderLayout());
      mainPanel.setImage(image,true); //hier kann man einstellen, ob das Bild im Original oder eingepasst ausgegeben werden soll (true/false)
      //System.out.println(mainPanel.setY());
      JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      southPanel.setOpaque(false); //entscheidet, ob das Button-Panel durchsichtig sein soll
      southPanel.add(createButtonPanel(southPanel.isOpaque()));

      mainPanel.add(southPanel, BorderLayout.SOUTH);
      return mainPanel;
   }

   //erzeugt ein Panel mit Buttons, bei Übergabe von true wird das Panel undurchsichtig
   private JPanel createButtonPanel(boolean opaque) {
      JPanel panel = new JPanel(new GridLayout(1, 0, 5, 5));
      panel.setOpaque(opaque);
      panel.add(new JButton("Abbrechen"));
      
      JButton ok = new JButton("OK");
      panel.add(ok);
      ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//mainPanel.setypos();
			}
		});
      //Ereignisverarbeitung fehlt!
      return panel;
   }

   public static void main(String[] args) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch(Exception e) {
         System.err.println(e);
      }

      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new BackgroundImageTest();
         }
      });
   }
}