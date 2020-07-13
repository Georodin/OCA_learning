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
		
		if(journey==true) {
			System.out.println("1 - reisen");
		}
		if(fight==true) {
			System.out.println("2 - kaempfen");
		}
		if(rest==true) {
			System.out.println("3 - warten");
		}
		if(trade==true) {
			System.out.println("4 - Waren handeln");
		}
		if(potion==true) {
			System.out.println("5 - Trank nutzen");
		}
		if(flee==true) {
			System.out.println("6 - Run Forest run!");
		}
		if(showInventory==true) {
			System.out.println("7 - Inventar anzeigen");
		}
		if(journeyCon==true) {
			System.out.println("8 - Reise fortsetzen");
		}
		if(locationType==3) {
			System.out.println("9 - zum Haus begeben");
		}
		
		//Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String action = reader.readLine(); 
  
        // Printing the read line 
        System.out.println();   
		
		if(journey==true&&action.equals("1")) {
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
			Fight(hero, monster);
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
		}else if(journeyCon==true&&action.equals("8")) {
			System.out.println("Weiter reisen");
			System.out.println(city.getName()+" ist "+Math.round(hero.getDistanceToTravel())+"km entfernt.");
			System.out.println("Restliche Reise nach "+city.getName()+" wird ca. "+Math.round(hero.getDistanceToTravel()/6)+" Stunden dauern.");
			System.out.println("Weiter nach "+city.getName()+" reisen?");
			next = false;
			journey=true;
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
		if(journey==true) {
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
        
		if((journey==true||journeyCon==true)&&(action.equals("1")||action.equals("8"))) {
			System.out.println("Reisen begonnen");
			if(hero.getDistanceToTravel()==-1) {
			hero.setDistanceToTravel(city.distance(hero));
			}
			while (hero.getDistanceToTravel()>0) {
			Random r = new Random();
			float chance = r.nextFloat();

			  if (chance <= 0.50f) {
				  if(foundMonster==false) {
					foundMonster = true;
					locationType = 1;
					journey = false;
					fight = true;
					rest = false;
					trade = false;
					potion = true;
					next = false;
					flee = true;
					 	System.out.println("Ein Monster stellt sich dir in den Weg!");
						  Action(hero,monster,city,trader);
						  return false;
				  }
				 
			  }
			  System.out.println("Reise nach wird "+city.getName()+" noch ca. "+Math.round(hero.getDistanceToTravel()/6)+" Stunden dauern.");
			  hero.setDistanceToTravel(hero.getDistanceToTravel()-6);
			}
			System.out.println("Das Ziel befindet sich in 50m auf der rechten Seite.");
			
			locationType = 3;
			journey = false;
			journeyCon = false;
			fight = false;
			rest = true;
			trade = true;
			potion = false;
			next = false;
			flee = false;
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
		
		System.out.println("Du gibst dem "+monster.getName()+" einen Hieb: "+dmg_end+" Schaden!");
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
			
			System.out.println("Der "+monster.getName()+" tritt dich: "+dmg_end+" Schaden!");
			System.out.println("Der "+monster.getName()+" hat "+monster.getHealth()+" Lebenspunte uebrig!");
			System.out.println("Du hast "+hero.getHealth()+" Lebenspunte uebrig!");
			
		}else{
			System.out.println("Du hast den "+monster.getName()+" besiegt!");
			System.out.println("Du erhaelst "+monster.getGold()+" Gold von dem besiegten "+monster.getName()+".");
			hero.setGold(hero.getGold()+monster.getGold());
			locationType = 2;
			journey = false;
			journeyCon = true;
			fight = false;
			rest = true;
			trade = false;
			potion = false;
			next = false;
			flee = false;
		}
		
	}


}