package schulzke.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiDemo {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(600,600);
		f.setTitle("Mein tolles Programm!");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		
		JPanel pane = new JPanel(new GridBagLayout());
    	JLabel label = new JLabel();
		label.setText("Hallo");
		
        GridBagConstraints gbc = new GridBagConstraints();
        
        Font buttonFont = new Font("Arial",Font.BOLD, 48);
        
        String strButton[] = 	{"7","8","9","<","AC",
                "4","5","6","x",":",
                "1","2","3","+","-",
                "0",".","+/-","="};

		JButton button[] = new JButton[19];
		
		/*gbc.gridwidth = 3;
		gbc.gridheight = 2;*/
        
        gbc.insets = new Insets(2,2,2,2);
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.BOTH;
		
		int x = 0;
		int y = 0;
		for (int i=0;i<strButton.length;i++) {
			//if end of line go to next line
	        if(x==5) {
	        	x = 0;
				y++;
	        }
	        
	        //if end of line go to next line
			button[i] = new JButton(strButton[i]);
			button[i].putClientProperty( "index", i );
			
			gbc.gridx = x;
	        gbc.gridy = y;
	        
	        button[i].setBackground(Color.RED);		
			button[i].setForeground(Color.WHITE);	
	        
	        button[i].setFont(buttonFont);
	        button[i].setPreferredSize(new Dimension(110, 60));
	        button[i].setMinimumSize(new Dimension(110, 60));
	        
	        pane.add(button[i], gbc);

			
			button[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					int i = (Integer)((JButton)e.getSource()).getClientProperty( "index" );
					label.setText(strButton[i]); 
					}
				});
			x++;
		}
		
        buttonPanel.add(pane, BorderLayout.CENTER);
		buttonPanel.add(label, BorderLayout.PAGE_START);
        
        f.add(buttonPanel);
        f.setVisible(true);
    }
}