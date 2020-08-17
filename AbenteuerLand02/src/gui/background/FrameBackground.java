package gui.background;

import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import gui.button.start.ButtonStart;
import gui.startmenu.StartMenu;

public class FrameBackground extends JPanel{
	
	public void paint(Graphics g)
	{	
	    Image imgForeground, imgBackground;
		try {
			imgBackground = ImageIO.read(new File("src/gui/background/startB.png"));
			g.drawImage(imgBackground , 0, 0, this);
			imgForeground = ImageIO.read(new File("src/gui/background/startA.png"));
			g.drawImage(imgForeground , 0, 0, this);
		} catch (IOException e) {
			System.out.println("Hintergrundatei konnte nicht geladen werden!");
			e.printStackTrace();
		}
	}
	
	public FrameBackground() {
		super();
		super.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridx = 1;
		gbc.gridy = 0;
		for(int i=0;i<20;i++) {
			super.add(new JPanel(), gbc);
			gbc.gridy++;
		}
		super.add(new ButtonStart(this), gbc);
		//super.add(new StartMenu(), gbc);
		super.setVisible(true);
	}
	
}