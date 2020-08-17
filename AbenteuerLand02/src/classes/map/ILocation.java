package classes.map;

import classes.creature.Hero;

public interface ILocation {
	default void travel(ILocation destination, Hero hero) {
		
	};
}
