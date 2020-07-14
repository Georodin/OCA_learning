package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class House {
	private String name = "Menouthis Weg 4";
	
	private Inventory inv = new Inventory();
	
	private static boolean next = false;
	
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getGold(){
		return this.inv.getGold();
	}
	
	public void setGold(int gold){
		this.inv.setGold(gold);
	}
	
	public int getPotion(){
		return this.inv.getPotion();
	}
	
	public void setPotion(int potion){
		this.inv.setPotion(potion);
	}
	
	public void store(Adventurer hero, World world) throws IOException {
		System.out.println("Du bist in deinem Zimmer im "+this.getName());
		while(next==false) {
			System.out.println("Was möchtest du machen?\n");
	
			
			System.out.println("1 - Gold abladen");
			System.out.println("2 - Traenke abladen");
			System.out.println("3 - schalfen und essen");
			System.out.println("4 - Haus verlassen");
			
			
			//Enter data using BufferReader 
	        BufferedReader reader =  
	                   new BufferedReader(new InputStreamReader(System.in)); 
	         
	        // Reading data using readLine 
	        String action = reader.readLine(); 
	  
	        // Printing the read line 
	        System.out.println();  
	        
			if(action.equals("1")) {
				next = false;
			}else if(action.equals("2")) {
				next = false;
			}else if(action.equals("3")) {
				world.setTime(4);
				hero.setHealth(100f);
				System.out.println(world.showTime());
				System.out.println("Du hast dich ausgeschalfen und etwas gegessen. \nDeine HP wurden auf 100% aufgefuellt.");
				next = false;
			}else if(action.equals("4")) {
				next = true;
				System.out.println("Du verlaesst dein Haus...");
			}else {
				System.out.println("Ungueltige Eingabe!");
			}
		}
	}
	
	public void storePotions(Adventurer hero, World world) throws IOException {
		System.out.println("Wie viele Traenke möchtest du abladen?");
		while(next==false) {
			System.out.println("Was möchtest du machen?\n");
	
			
			System.out.println("1 - Gold abladen");
			System.out.println("2 - Traenke abladen");
			System.out.println("3 - schalfen und essen");
			System.out.println("4 - Haus verlassen");
			
			
			//Enter data using BufferReader 
	        BufferedReader reader =  
	                   new BufferedReader(new InputStreamReader(System.in)); 
	         
	        // Reading data using readLine 
	        String action = reader.readLine(); 
	  
	        // Printing the read line 
	        System.out.println();  
	        
			if(action.equals("1")) {
				next = false;
			}else if(action.equals("2")) {
				next = false;
			}else if(action.equals("3")) {
				world.setTime(4);
				hero.setHealth(100f);
				System.out.println(world.showTime());
				System.out.println("Du hast dich ausgeschalfen und etwas gegessen. \nDeine HP wurden auf 100% aufgefuellt.");
				next = false;
			}else if(action.equals("4")) {
				next = true;
				System.out.println("Du verlaesst dein Haus...");
			}else {
				System.out.println("Ungueltige Eingabe!");
			}
		}
	}
}
