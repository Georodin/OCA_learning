package adventure;

import java.util.Random;

public class AdventureTime {

	public static void main(String[] args) {
		World world = new World();
		Adventurer hero = new Adventurer();
		Monster monster = new Monster();
		City city = new City();
		City city1 = new City();
		City city2 = new City();
		City city3 = new City();
		
		world.setTime(0);
		world.setTime(1);
		world.setTime(2);
		world.setTime(3);
		System.out.println(world.getTime());
		Fight(hero, monster);
		System.out.println(city.distance(hero));
		System.out.println(City.noOfCitys); 
		System.out.println(City.distances(hero)); 
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
			//monster attacks back
			rnd_dmg = new Random();
			dmg = (float) rnd_dmg.nextInt(4)/10;
					
			rnd_minus = new Random();
			
			if(rnd_minus.nextInt(2)==0) {
				dmg_end = (int) (monster.getStrength()*(1+dmg));
				
			}else {
				dmg_end = (int) (monster.getStrength()*(1-dmg));
			}
			
			hero.setHealth(hero.getHealth()-dmg_end);
			
		}else{
			System.out.println("You defeated monster!");
		}
		
		System.out.println(hero.getHealth());
		System.out.println(monster.getHealth());
	}

}