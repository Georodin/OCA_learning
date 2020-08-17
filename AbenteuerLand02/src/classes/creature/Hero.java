package classes.creature;

import java.awt.Dimension;

public class Hero extends ACreature{
	Dimension location;

	public Dimension getLocation() {
		return location;
	}

	public void setLocation(Dimension location) {
		this.location = location;
	}

	public Hero(String name) {
		super(name, 1, 10);
		this.location = new Dimension(0,0);
	}
}
