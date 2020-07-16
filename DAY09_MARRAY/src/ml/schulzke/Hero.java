package ml.schulzke;

import java.util.Random;

public class Hero {
	
	private String name = "name";
	private int age = 0;
	private int level = 1;
	private Float health = 100f;
	private Float distanceToTravel = -1f;
	private boolean ownFlat = false;
	
	private int strength = 10;
	private double x = 285;
	private double y = 182;
	
	public boolean isOwnFlat(){
	    return ownFlat;
	}

	public void setOwnFlat(final boolean ownFlat){
	    this.ownFlat = ownFlat;
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
	
	
	
}
