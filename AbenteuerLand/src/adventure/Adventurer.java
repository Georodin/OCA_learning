package adventure;

public class Adventurer {
	
	private String name = "name";
	private int age = 0;
	private int health = 0;
	private int strength = 0;
	//private Inventory = new Inventory; > Gold > Weapons > Clothing > Potions
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setName(int age){
		this.age = age;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public int getStrength(){
		return this.strength;
	}
	
	public void setStrength(int strength){
		this.strength = strength;
	}
}
