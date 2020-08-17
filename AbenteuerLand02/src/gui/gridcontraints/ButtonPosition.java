package gui.gridcontraints;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class ButtonPosition extends GridBagConstraints {
	public ButtonPosition(int x, int y) {
		super.insets = new Insets(2, 2, 2, 2);
		
		super.gridx = x;
		super.gridy = y;
		
	}
	public ButtonPosition() {
	}
}

