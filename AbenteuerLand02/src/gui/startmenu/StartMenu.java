package gui.startmenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.button.position.ButtonPosition;

public class StartMenu extends JPanel{

	public StartMenu() {
		super();
		System.out.println("Start MENU");
		super.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JButton newGame = new JButton("Neues Spiel");
		JButton loadGame = new JButton("Spiel laden");
		JButton settingGame = new JButton("Einstellungen");
		JButton leaveGame = new JButton("Verlassen");
		
		newGame.setBackground(Color.black);		
		newGame.setForeground(Color.white);	
		newGame.setPreferredSize(new Dimension(110, 60));
		newGame.setMinimumSize(new Dimension(110, 60));
		
		loadGame.setBackground(Color.black);		
		loadGame.setForeground(Color.white);	
		loadGame.setPreferredSize(new Dimension(110, 60));
		loadGame.setMinimumSize(new Dimension(110, 60));
		
		settingGame.setBackground(Color.black);		
		settingGame.setForeground(Color.white);	
		settingGame.setPreferredSize(new Dimension(110, 60));
		settingGame.setMinimumSize(new Dimension(110, 60));
		
		leaveGame.setBackground(Color.black);		
		leaveGame.setForeground(Color.white);	
		leaveGame.setPreferredSize(new Dimension(110, 60));
		leaveGame.setMinimumSize(new Dimension(110, 60));
		
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridx = 1;
		gbc.gridy = 0;
		super.add(newGame,new ButtonPosition(0,1));
		gbc.gridy++;
		super.add(loadGame, new ButtonPosition(0,2));
		gbc.gridy++;
		super.add(settingGame, new ButtonPosition(0,3));
		gbc.gridy++;
		super.add(leaveGame, new ButtonPosition(0,4));
		newGame.setVisible(true);
		loadGame.setVisible(true);
		settingGame.setVisible(true);
		leaveGame.setVisible(true);
		super.setVisible(true);
	}
	
}
