package gui.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test{
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame(); 
		
		frame.setTitle("Adventure Time");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		
		
			JPanel panel = new JPanel();
	        Dimension panelSize = new Dimension(640, 480);
	        panel.setPreferredSize(panelSize);
	  
			panel.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.anchor = GridBagConstraints.CENTER;
			gbc.fill = GridBagConstraints.BOTH;
			gbc.gridy = 0;
			gbc.gridwidth = 1;
			gbc.gridheight = 1;

				JButton button = new JButton("Start");	
				button.setBackground(Color.black);		
				button.setForeground(Color.white);	
				button.setPreferredSize(new Dimension(110, 60));
				button.setMinimumSize(new Dimension(110, 60));
				button.setVisible(true);
			
			
			for(int i=0;i<20;i++) {
				panel.add(new JPanel(), gbc);
				gbc.gridy++;
			}
			
			
			panel.add(button, gbc);
			panel.setVisible(true);
		
		frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
