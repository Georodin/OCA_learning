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
	
	public void store(Hero hero, World world) throws IOException {
		System.out.println("Du bist in deinem Zimmer im "+this.getName());
		while(next==false) {
			System.out.println("Was möchtest du machen?\n");
	
			
			System.out.println("1 - Gold abladen/einladen");
			System.out.println("2 - Traenke abladen/einladen");
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
				this.storePotions(hero,world);
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
	
	public void storePotions(Hero hero, World world) throws IOException {
		while(next==false) {
			
			System.out.println("In deiner Kiste hast du "+this.getPotion()+" Traenke.");
			System.out.println("In deinem Inventar hast du "+hero.getPotion()+" Traenke.");
			System.out.println("Was möchtest du machen?");
			if(this.getPotion()>0) {
				
			}
			System.out.println("1 - Traenke abladen");
			System.out.println("2 - Traenke abholen");
			System.out.println("3 - zurück");
			
			
			//Enter data using BufferReader 
	        BufferedReader reader =  
	                   new BufferedReader(new InputStreamReader(System.in)); 
	         
	        // Reading data using readLine 
	        String action = reader.readLine(); 
	  
	        // Printing the read line 
	        System.out.println();  
	        
			if(action.equals("1")) {
				inputPot_Number(this, hero, world, 0);
				next = false;
			}else if(action.equals("2")) {
				next = false;
			}else if(action.equals("3")) {
				next = false;
			}else if(action.equals("4")) {
				next = true;
				System.out.println("Du verlaesst dein Haus...");
			}else {
				System.out.println("Ungueltige Eingabe!");
			}
		}
		
	}
	
	static String potionCount(House house, Hero hero) {
		return "In deiner Kiste hast du "+house.getPotion()+" Traenke.\n"+
		"In deinem Inventar hast du "+hero.getPotion()+" Traenke.\n"+
		"Gib ein wie viele Traenke du ablegen moechtest: (maximal "+hero.getPotion()+")";
	}
	
	static void inputPot_Number(House house, Hero hero, World world, int state) throws IOException {
		
		//Enter data using BufferReader 
        BufferedReader reader;
        
        // Reading data using readLine 
        String action;
        
        int inputNumber = 0;
        
        boolean isCorrect = false;
        
        while(isCorrect==false) {
        	
        	System.out.println(potionCount(house, hero));
            isCorrect = false;
        	
        	reader =  
                    new BufferedReader(new InputStreamReader(System.in));
        	action = reader.readLine();
        	
        	if(isNumeric(action)) {
        		inputNumber = Integer.parseInt(action);
        		if(inputNumber<=hero.getPotion()) {
        			isCorrect = true;
        		}else{
        			System.out.println("Wert zu gross! Ungueltige Eingabe!");
        		}
        	}else {
        		System.out.println("Ungueltige Eingabe!");
        	}
        }
    	
        hero.setPotion(hero.getPotion()-inputNumber);
        house.setPotion(house.getPotion()+inputNumber);
        System.out.println("\nDu hast "+inputNumber+" Traenke abgelegt.");
    	System.out.println("In deiner Kiste hast du nun "+house.getPotion()+" Traenke.");
		System.out.println("In deinem Inventar hast du nun "+hero.getPotion()+" Traenke.");
	}
	
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
