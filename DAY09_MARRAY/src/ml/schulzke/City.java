package ml.schulzke;

public class City {
	
	private String name;
	private int posX;
	private int posY;
	
	
	public City(String name,int x,int y){
		   this.name = name;
		   this.posX = x;
		   this.posY = y;
	}
	
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
	
	public float distance(Hero hero) {
		return (float) Math.sqrt(((this.posX-hero.getX())*(this.posX-hero.getX()))+((this.posY-hero.getY())*(this.posY-hero.getY())));
	}

}
