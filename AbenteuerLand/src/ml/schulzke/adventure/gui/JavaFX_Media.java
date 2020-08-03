package ml.schulzke.adventure.gui;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

class JavaMKV {
	public static void main(String args[]) {
	    // create a file chooser
	    JFileChooser fileChooser = new JFileChooser();
	
	    // show open file dialog
	    int result = fileChooser.showOpenDialog(null);
	
	    if (result == JFileChooser.APPROVE_OPTION) // user chose a file
	    {
	        URL mediaURL = null;
	
	        try {
	            // get the file as URL
	            mediaURL = fileChooser.getSelectedFile().toURL();
	        } // end try
	        catch (MalformedURLException malformedURLException) {
	            System.err.println("Could not create URL for the file");
	        } // end catch
	
	        if (mediaURL != null) // only display if there is a valid URL
	        {
	            JFrame mediaTest = new JFrame("Media Tester");
	            mediaTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	            MediaPlayer mediaPanel = new MediaPlayer();
	            mediaPanel.setMediaLocation(mediaURL.toString());
	
	            mediaTest.add(mediaPanel);
	
	            mediaTest.setSize(300, 300);
	            mediaTest.setVisible(true);
	        } // end inner if
	    } // end outer if
	}
}