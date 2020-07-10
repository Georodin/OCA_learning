package adventure;

public class Monster {
	private String name = "name";
	private Float health = 200f;
	private int strength = 15;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Float getHealth(){
		return this.health;
	}
	
	public void setHealth(Float health){
		this.health = health;
	}
	
	public int getStrength(){
		return this.strength;
	}
	
	public void setStrength(int strength){
		this.strength = strength;
	}
}
