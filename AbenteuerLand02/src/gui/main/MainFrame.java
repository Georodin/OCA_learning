package gui.main;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.background.FrameBackground;
import gui.button.start.ButtonStart;
import gui.gridcontraints.ButtonPosition;


public class MainFrame  extends JFrame {
	public MainFrame() {
		super();
		super.setSize(646, 509);
		super.setResizable(false);
		super.setTitle("Adventure Time");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.add(new FrameBackground());
		//super.add(new JPanel());
		//super.setLayout(new GridLayout(5,5));
		//super.add(new ButtonStart(), new ButtonPosition(3, 4));
		super.setLocation(500, 500); 
		super.setAlwaysOnTop(true);
		super.setVisible(true);
		
	}

}
