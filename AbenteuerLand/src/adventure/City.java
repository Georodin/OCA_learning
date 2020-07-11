package adventure;

public class City {
	
	static int noOfCitys = 0; 
    { 
    	noOfCitys += 1; 
    } 
	
	private String name = "Stadt";
	private int posX = 15;
	private int posY = 15;
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public int getPosX(){
		return this.posX;
	}
	
	public void setPosX(int posX){
		this.posX = posX;
	}
	
	public int getPosY(){
		return this.posY;
	}
	
	public void setPosY(int posY){
		this.posY = posY;
	}
	
	
	public String distance(Adventurer hero) {
		return ""+Math.sqrt(((this.posX-hero.getX())*(this.posX-hero.getX()))+((this.posY-hero.getY())*(this.posY-hero.getY())));
	}
}
