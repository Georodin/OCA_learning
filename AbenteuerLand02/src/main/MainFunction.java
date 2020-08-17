package main;

import classes.creature.ACreature;
import classes.creature.Hero;
import classes.creature.IFighting;
import gui.main.*;

public class MainFunction {
		
		public static void main(String[] args) {
			
			MainFrame mainframe = new MainFrame();
			
			ACreature hero = new Hero("Alixpress");
			System.out.println(hero.getName());
		}
}