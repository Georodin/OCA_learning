package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	
	public void getDistances(Hero hero, City[] citys) {
		for(int i = 0; i<citys.length;i++) {
			System.out.println(citys[i].getName()+" ist "+Math.round(citys[i].distance(hero))+"km entfernt.");
			System.out.println("Reise nach "+citys[i].getName()+" wird ca. "+Math.round(citys[i].distance(hero)/6)+" Stunden dauern.");
			System.out.println("Nach "+citys[i].getName()+" reisen?\n");
		}
	}
	
	public void selectCity(Hero hero, City[] citys) throws IOException {

        int i = 0;
        while(i<citys.length) {
        	System.out.println((i+1)+" - Nach "+citys[i].getName()+" reisen?\n");
        	if(this==citys[i]) {
        		System.out.println((i+1)+" -wdjiaijdijawijdw Nach "+citys[i].getName()+" reisen?\n");
        	}
        	i++;
        }
        
		//Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String action = reader.readLine(); 
        
        
	}

}
