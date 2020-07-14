package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trader {
	private String name = "Abubakar";
	private int gold = 2400;
	private int potionPrice = 1;
	private int flatPrice = 30;
	
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getGold(){
		return this.gold;
	}
	
	public void setGold(int gold){
		this.gold = gold;
	}
	
	public int getPotionPrice(){
		return this.potionPrice;
	}
	
	public void setPotionPrice(int potionPrice){
		this.potionPrice = potionPrice;
	}
	
	public int getFlatPrice(){
		return this.flatPrice;
	}
	
	public void setFlatPrice(int flatPrice){
		this.flatPrice = flatPrice;
	}
	
	public void trade(Adventurer hero,Controls controls) throws IOException {
		System.out.println("Hallo ich bin "+this.getName()+" ein Haendler unserer schönen Stadt. Ich biete nur die besten Waren für Reisende an.\n");
		while(controls.isNextTrade()==false) {
		System.out.println("Für dich habe ich Heiltraenke für "+this.getPotionPrice()+" Gold pro Trank.\n");
		if(hero.isOwnFlat()==false) {
			System.out.println("Oder vielleicht ein schönes Zimmer für "+this.getFlatPrice()+" Gold in einer Lehmhuette am Rand der Stadt?");
		}
		
		System.out.println("1 - Heiltrank kaufen "+this.getPotionPrice()+" Gold");
		if(hero.isOwnFlat()==false) {
		System.out.println("2 - Zimmer kaufen "+this.getFlatPrice()+" Gold");
		}
		System.out.println("3 - handel beenden");
		
		
		//Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String action = reader.readLine(); 
  
        // Printing the read line 
        System.out.println();  
        
		if(action.equals("1")) {
			if(hero.getGold()>=1) {
				hero.setGold(hero.getGold()-1);
				hero.setPotion(hero.getPotion()+1);
				System.out.println("Hier ein Heiltrank hoechster Qualität für Euch!");
				controls.setNextTrade(false);
			}else {
				System.out.println("Bitte kommt wieder wenn Ihr genuegend Gold habt...");
				controls.setNextTrade(true);
			}
		}else if(action.equals("2")&&hero.isOwnFlat()==false) {
			if(hero.getGold()>=this.getFlatPrice()) {
				hero.setGold(hero.getGold()-this.getFlatPrice());
				hero.setOwnFlat(true);
				hero.setKeyHouse(true);
				System.out.println("Hier die Schlüssel. Schaut doch gleich mal vorbei!");
				controls.setNextTrade(false);
			}else {
				System.out.println("Bitte kommt wieder wenn Ihr genuegend Gold habt...");
				System.out.println("Euch fehlen noch "+(this.getFlatPrice()-hero.getGold())+" Gold zum Eigenheim!");
				controls.setNextTrade(false);
			}
		}else if(action.equals("3")) {
			System.out.println("Handel beendet!");
			controls.setNextTrade(true);
			
		}else {
			System.out.println("Ungueltige Eingabe!");
			controls.setNextTrade(false);
		}
        
		}
	}
}
