package ml.schulzke.adventure;

public class House {
	private String name = "Menouthis Weg 4";
	private int gold = 0;
	private int potion = 0;
	
	
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
	
	public int getPotion(){
		return this.potion;
	}
	
	public void setPotion(int potion){
		this.potion = potion;
	}
	
}
