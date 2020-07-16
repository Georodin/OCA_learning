package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AdventureTime {
	
	static Float trvl_distance = -1f;
	
	static House house = new House();
	static World world = new World();
	static Controls controls = new Controls();

	public static void main(String[] args) throws IOException {
		
		Hero hero = new Hero();
		hero.setPotion(3);
		hero.setGold(60);
		Monster monster = new Monster();
		City[] city = new City[3];
		
		city[0] = new City("Men-nefer",290,165);
		city[1] = new City("Heliopolis",262,170);
		city[2] = new City("Merimda",250,130);
		
		System.out.println(city[0].distance(hero));
		System.out.println(city[1].distance(hero));
		System.out.println(city[2].distance(hero));
		Trader trader = new Trader();

		System.out.println("Es ist der 5. Tag des Achet II im Lande Kemet!");
		System.out.println("Sei auf der Hut Abenteurer, gefährliche Kreaturen lauern in diesen Gefilden.\n");
		
		/*City obj[] = new City[4];
		
		obj[0].setData("Hello", 15,15);
		obj[1].setData("Hello", 15,15);
		obj[2].setData("Hello", 15,15);
		obj[3].setData("Hello", 15,15);
		
		
		
		world.setTime(0);
		world.setTime(1);
		world.setTime(2);
		world.setTime(3);
		System.out.println(world.getTime());
		Fight(hero, monster);
		System.out.println(city);
		System.out.println(city[0]distance(hero));
		System.out.println(City.noOfCitys); 
		
		*/
		Action(hero,monster,city[0],trader,city);

		
	}
	
	public static void Action(Hero hero,Monster monster,City city,Trader trader, City[] citys) throws IOException {
		
		while (controls.isNext()==false) {
			
			controls.setNext(true);
			
		if(controls.getLocationType()==0) {
			System.out.println("Du bist in der Wildniss! Was möchtest du machen?");
		}else if(controls.getLocationType()==1) {
			System.out.println("Du bist in einem Kampf mit einem "+monster.getName());
		}else if(controls.getLocationType()==2) {
			System.out.println("Du bist in der Wildniss! Moechtest du die Reise fortsetzen?");
		}else if(controls.getLocationType()==3) {
			System.out.println("Du bist in "+city.getName()+". Was möchtest du machen?");
		}
		System.out.println(controls.print());
		
		//Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String action = reader.readLine(); 
  
        // Printing the read line 
        System.out.println();   
		
		if(controls.isJourney()==true&&action.equals("1")) {
			System.out.println("Reisen");
			city.getDistances(hero, citys);
			city.selectCity(hero, citys);
			
			controls.setNext(false);
			Travel(hero,monster,city,trader,citys);
			
		}
		else if(controls.isFight()==true&&action.equals("2")) {
			System.out.println("Kampf");
			controls.setNext(false);
			hero.fight(monster, controls, world);
			
		}
		else if(controls.isRest()==true&&action.equals("3")) {
			world.setTime(1);
			System.out.println("Eine Stunde gewartet.");
			System.out.println(world.showTime());
			controls.setNext(false);
			Action(hero,monster,city,trader,citys);
			
		}
		else if(controls.isTrade()==true&&action.equals("4")) {
			System.out.println("4 - Waren handeln");
			controls.setNext(false);
			controls.setNextTrade(false);
			trader.trade(hero, controls);
			Action(hero,monster,city,trader,citys);
			
		}
		else if(controls.isPotion()&&action.equals("5")) {
			System.out.println(hero.usePotion());
			controls.setNext(false);
			
		}else if(controls.isFlee()==true&&action.equals("6")) {
			System.out.println("6 - Geflohen!");
			
		}else if(controls.isShowInventory()==true&&action.equals("7")) {
			System.out.println(hero.getInv());
			controls.setNext(false);
			
		}else if(controls.isJourneyCon()==true&&action.equals("8")) {
			System.out.println("Weiter reisen");
			System.out.println(city.getName()+" ist "+Math.round(hero.getDistanceToTravel())+"km entfernt.");
			System.out.println("Restliche Reise nach "+city.getName()+" wird ca. "+Math.round(hero.getDistanceToTravel()/6)+" Stunden dauern.");
			System.out.println("Weiter nach "+city.getName()+" reisen?");
			controls.setNext(false);
			controls.setJourney(true);
			Travel(hero,monster,city,trader,citys);
			
		}else if(controls.isHouse()==true&&action.equals("9")) {
			System.out.println("Du begibst dich zum "+house.getName());
			if(hero.isOwnFlat()==false) {
				
				System.out.println("Scheint als waere die Tuer verschlossen...");
				controls.setNext(false);
				Action(hero,monster,city,trader,citys);
			}else {
				System.out.println("Yeah die Tuer geht auf!");
				house.store(hero, world);
				controls.setNext(false);
				Action(hero,monster,city,trader,citys);
			}
		}else {
			System.out.println("Ungueltige Eingabe!");
			controls.setNext(false);
			
		}
		}
	}
	
	public static boolean Travel(Hero hero,Monster monster,City city,Trader trader,City[] citys) throws IOException {
		while (controls.isNext()==false&&(hero.getDistanceToTravel()==-1||hero.getDistanceToTravel()>0)) {
				controls.setNext(false);
			if(controls.isJourney()==true) {
				System.out.println("1 - reisen");
			}
			if(controls.isRest()==true) {
				System.out.println("2 - abbrechen");
			}
			//Enter data using BufferReader 
	        BufferedReader reader =  
	                   new BufferedReader(new InputStreamReader(System.in)); 
	         
	        // Reading data using readLine 
	        String action = reader.readLine(); 
	  
	        // Printing the read line 
	        System.out.println();   
	        
			if((controls.isJourney()==true||controls.isJourneyCon()==true)&&(action.equals("1")||action.equals("8"))) {
				System.out.println("Reisen begonnen");
				if(hero.getDistanceToTravel()==-1) {
					hero.setDistanceToTravel(city.distance(hero));
				}
				while (hero.getDistanceToTravel()>0) {
					Random r = new Random();
					float chance = r.nextFloat();
	
				  if (chance <= 0.01f) {
					  if(controls.isFoundMonster()==false) {
						controls.setFoundMonster(true);
						 	System.out.println("Ein Monster stellt sich dir in den Weg!");
						 	controls.setStartFight(world.getTime());
						 	controls.changeControls(1);
						 	controls.setLocationType(1);
						 	Action(hero,monster,city,trader,citys);
							  return false;
					  }
					 
				  }
				  System.out.println("Reise nach wird "+city.getName()+" noch ca. "+Math.round(hero.getDistanceToTravel()/6)+" Stunden dauern.");
				  hero.setDistanceToTravel(hero.getDistanceToTravel()-6);
				  world.setTime(1);
				}
				System.out.println("Das Ziel befindet sich in 50m auf der rechten Seite.");
				System.out.println(world.showTime());
				controls.changeControls(5);
				controls.setLocationType(3);
				
			}
			else if(controls.isRest()==true&&action.equals("2")) {
				System.out.println("abgebrochen");
				controls.setNext(false);
				Action(hero,monster,city,trader,citys);
			}else {
				System.out.println("Ungueltige Eingabe!");
				controls.setNext(false);
			}
		}
		return true;
		
	}


}