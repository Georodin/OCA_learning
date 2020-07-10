package adventure;

import java.util.Random;

public class AdventureTime {

	public static void main(String[] args) {
		World world = new World();
		Adventurer hero = new Adventurer();
		Monster monster = new Monster();
		
		world.setTime(true);
		world.setTime(false);
		System.out.println(world.getTime());
		Fight(hero, monster);
		Fight(hero, monster);
		Fight(hero, monster);
		Fight(hero, monster);
		Fight(hero, monster);
	}
	
	
	public static void Fight(Adventurer hero,Monster monster) {

		
		Random rnd_dmg = new Random();
		Float dmg = (float) rnd_dmg.nextInt(4)/10;
		int dmg_end;
				
		Random rnd_minus = new Random();
		
		if(rnd_minus.nextInt(2)==0) {
			dmg_end = (int) (hero.getStrength()*(1+dmg));
			
		}else {
			dmg_end = (int) (hero.getStrength()*(1-dmg));
		}
		
		if((monster.getHealth()-dmg_end)>0) {
			monster.setHealth(monster.getHealth()-dmg_end);
		}{
			
		}
		
		System.out.println(hero.getHealth());
		System.out.println(monster.getHealth());
	}

}