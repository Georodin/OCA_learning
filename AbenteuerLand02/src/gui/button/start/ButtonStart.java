package gui.button.start;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

import gui.background.*;
import gui.startmenu.StartMenu;

public class ButtonStart extends JButton{

	public ButtonStart(FrameBackground panel) {
		super("Start");
		//super.setBackground(background);		
		super.setBackground(Color.black);		
		super.setForeground(Color.white);	
		//super.setFont(new MainFont());
		super.setPreferredSize(new Dimension(110, 60));
		super.setMinimumSize(new Dimension(110, 60));
		super.addActionListener(e -> {panel.removeAll(); panel.add(new StartMenu());panel.repaint();panel.revalidate();});
		super.setVisible(true);
	}

}
