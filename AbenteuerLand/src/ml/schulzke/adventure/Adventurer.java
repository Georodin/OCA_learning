package ml.schulzke.adventure;

import java.util.Random;

public class Adventurer {
	
	private String name = "name";
	private int age = 0;
	private int level = 1;
	private Float health = 100f;
	private Float distanceToTravel = -1f;
	private boolean ownFlat = false;
	
	private int strength = 10;
	private Inventory inv = new Inventory(); // Gold > Weapons > Clothing > Potions
	private double x = 0;
	private double y = 0;
	
	public boolean isOwnFlat(){
	    return ownFlat;
	}

	public void setOwnFlat(final boolean ownFlat){
	    this.ownFlat = ownFlat;
	}
	
	public String getInv(){
		return "Du besitzt:\n"+this.inv.getGold()+" Gold\n"+this.inv.getPotion()+" Heiltraenke\n";
	}
	
	public double getX(){
		return this.x;
	}
	public void setX (double x){
		this.x = x;
	}
	public double getY(){
		return this.y;
	}
	public void setY (double y){
		this.y = y;
	}
	
	public String usePotion() {
		String out = null;
		if(this.inv.getPotion()>0) {
			
			this.setHealth(100f);
			this.inv.setPotion(this.inv.getPotion()-1);
		
			if(this.inv.getPotion()==0) {
				out = "Auf 100HP geheilt. Keine Heiltraenke mehr uebrig!";
			}else {
				out = "Auf 100HP geheilt. Heiltraenke uebrig: "+this.inv.getPotion();
			}
		}
		return out;
		
	}

	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public Float getHealth(){
		return this.health;
	}
	
	public void setHealth(Float health){
		this.health = health;
	}
	
	public Float getDistanceToTravel(){
		return this.distanceToTravel;
	}
	
	public void setDistanceToTravel(Float distanceToTravel){
		this.distanceToTravel = distanceToTravel;
	}
	
	public int getStrength(){
		return this.strength;
	}
	
	public void setStrength(int strength){
		this.strength = strength;
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
	
	
}
