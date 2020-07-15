package ml.schulzke.adventure;

public class Inventory {
	
	private int gold = 0;
	private int potion = 0;
	private boolean keyHouse = false;
	
	public boolean isKeyHouse() {
		return keyHouse;
	}

	public void setKeyHouse(boolean keyHouse) {
		this.keyHouse = keyHouse;
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
