package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AdventureTime {
	
	static boolean journey = true;
	static boolean journeyCon = false;
	static boolean fight = false;
	static boolean rest = true;
	static boolean trade = false;
	static boolean potion = false;
	static boolean next = false;
	static boolean flee = false;
	static boolean showInventory = true;
	static boolean foundMonster = false;
	static Float trvl_distance = -1f;
	static int locationType = 0;
	
	
	static House house = new House();
	static World world = new World();
	static Controls controls = new Controls();

	public static void main(String[] args) throws IOException {
		
		Adventurer hero = new Adventurer();
		Monster monster = new Monster();
		City city = new City();
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
		System.out.println(city.distance(hero));
		System.out.println(City.noOfCitys); 
		
		*/
		Action(hero,monster,city,trader);

		
	}
	
	public static void Action(Adventurer hero,Monster monster,City city,Trader trader) throws IOException {
		
		while (next==false) {
			
		next = true;
		
		if(locationType==0) {
			System.out.println("Du bist in der Wildniss! Was möchtest du machen?");
		}else if(locationType==1) {
			System.out.println("Du bist in einem Kampf mit einem "+monster.getName());
		}else if(locationType==2) {
			System.out.println("Du bist in der Wildniss! Moechtest du die Reise fortsetzen?");
		}else if(locationType==3) {
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
			System.out.println(city.getName()+" ist "+Math.round(city.distance(hero))+"km entfernt.");
			System.out.println("Reise nach "+city.getName()+" wird ca. "+Math.round(city.distance(hero)/6)+" Stunden dauern.");
			System.out.println("Nach "+city.getName()+" reisen?");
			next = false;
			Travel(hero,monster,city,trader);
		}
		else if(fight==true&&action.equals("2")) {
			System.out.println("Kampf");
			next = false;
			hero.fight(monster);
		}
		else if(rest==true&&action.equals("3")) {
			world.setTime(1);
			System.out.println("Eine Stunde gewartet.");
			System.out.println(world.showTime());
			next = false;
			Action(hero,monster,city,trader);
		}
		else if(trade==true&&action.equals("4")) {
			System.out.println("4 - Waren handeln");
			trader.trade(hero);
			next = false;
			Action(hero,monster,city,trader);
		}
		else if(potion==true&&action.equals("5")) {
			System.out.println(hero.usePotion());
			next = false;
		}else if(flee==true&&action.equals("6")) {
			System.out.println("6 - Geflohen!");
		}else if(showInventory==true&&action.equals("7")) {
			System.out.println(hero.getInv());
			next = false;
		}else if(controls.isJourneyCon()==true&&action.equals("8")) {
			System.out.println("Weiter reisen");
			System.out.println(city.getName()+" ist "+Math.round(hero.getDistanceToTravel())+"km entfernt.");
			System.out.println("Restliche Reise nach "+city.getName()+" wird ca. "+Math.round(hero.getDistanceToTravel()/6)+" Stunden dauern.");
			System.out.println("Weiter nach "+city.getName()+" reisen?");
			next = false;
			controls.setJourney(true);
			Travel(hero,monster,city,trader);
		}else if(action.equals("9")) {
			System.out.println("Du begibst dich zum "+house.getName());
			if(hero.isOwnFlat()==false) {
				
				System.out.println("Scheint als waere die Tuer verschlossen...");
				next = false;
				Action(hero,monster,city,trader);
			}else {
				System.out.println("Yeah die Tuer geht auf!");
				next = false;
				Action(hero,monster,city,trader);
			}
		}else {
			System.out.println("Ungueltige Eingabe!");
			next = false;
		}
		}
	}
	
	public static boolean Travel(Adventurer hero,Monster monster,City city,Trader trader) throws IOException {
		while (next==false&&(hero.getDistanceToTravel()==-1||hero.getDistanceToTravel()>0)) {
			next = true;
		if(controls.isJourney()==true) {
			System.out.println("1 - reisen");
		}
		if(rest==true) {
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

			  if (chance <= 0.50f) {
				  if(controls.isFoundMonster()==false) {
					controls.setFoundMonster(true);
					 	System.out.println("Ein Monster stellt sich dir in den Weg!");
						  Action(hero,monster,city,trader);
						  return false;
				  }
				 
			  }
			  System.out.println("Reise nach wird "+city.getName()+" noch ca. "+Math.round(hero.getDistanceToTravel()/6)+" Stunden dauern.");
			  hero.setDistanceToTravel(hero.getDistanceToTravel()-6);
			}
			System.out.println("Das Ziel befindet sich in 50m auf der rechten Seite.");
			
		}
		else if(rest==true&&action.equals("2")) {
			System.out.println("abgebrochen");
			next = false;
			Action(hero,monster,city,trader);
		}else {
			System.out.println("Ungueltige Eingabe!");
			next = false;
		}
		}
		return fight;
		
	}


}