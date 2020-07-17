package ml.schulzke.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Trader {
	
	String[] traderNames = new String[]{"Ahmose Pen-Nekhebet","Ahmose Sipair","Ahmose Sitayet","Ahmose, son of Ebana","Amenemhab","Amenemhet","Amenemhet","Amenhirkhepshef","Amenhotep, son of Hapu","Amenken","Amenmose","Amunemhat","Amunemhet","Anen","Ani","Ankhkhaf","Anubisemonekeh","Auibre","Banefre","Baufre","Bay","Bebi","Bek ","Dedi","Dedu","Djar","Djau","Djedefhor","Djedptahaufankh","Djehontyhetep","Djehutihotep","Djhutmose ","Hapuneseb","Hardedef","Harkhaf","Haremhab ","Hekaib","Hemiunu","Henenu","Hepzefa","Herihor","Horwedja","Huy","Huya","Ibebi","Ibi","Idu","Idut","Ikernofret","Ikhernofret","Ikudidy","Imhotep","Ineni","Intef","Inyotefoker","Ipuki","Irsu","Ipy","Iumeri","Kagemni","Kawab","Kenamon","Kewab","Kha","Khaemweset","Khamet","Khenemsu","Khensuhotep","Khentemsemet","Khuenre","Kheruef ","Khufukaef","Khnumhotep","Khui","Khusebek","Khuy","Maherpa","Mahu","Mai","Ma'nakhtuf","Masaharta","May","Maya","Mehy","Meketre","Men","Menkhaf","Menkheperresenb","Menna","Merenre","Mereruka","Meri","Merimose ","Meriptah","Merkha","Mernuterseteni","Meryatum","Meryre'","Merytatum","Metjen","Minnakht ","Mitry","Montuherkhopshef","Nakht or Nakhte","Nanefer-ka-ptah","Nebamun","Nebemakhet","Nebenteru","Nebetka","Nebmakhet","Nebwawi","Nebwenef","Neferhotep","Neferkheperuhersekheper ","Neferiryetnes","Neferma'at","Neferpert","Neferti","Neferu","Nefer-weben","Nehesy","Nehi","Nekaure'","Nekhebu","Nekonekh","Nekure","Nenkhsekhmet","Nenwef","Nessumontu","Nibamon, Nibamun, Nebamon","Padiaset","Pamiu","Panehsi/Panhey","Panhesy","Parennefer","Paser","Patenemheb","Pawah ","Pawara","Pawero","Penno","Penni","Penne","Pentu","Pepy-Nakht","Pinhasy","Prehirwonmef","Prehirwonnef","Ptahshepses, Ptah-Shepses","Puyemre'","Rahotep","Raia","Ramose","Ranofer ","Rawer","Re'emkuy","Re'hotpe","Rehu-erdjersenb, Rehu'ardjersen","Rekhmire","Renni","Ro-an, Ro-en, Ra-an","Rudjek","Ruia","Sabaf","Sabni","Sabu","Sarenpet","Sebek-khu","Sebni","Sehetepibre","Inti Sendjemib","Mehi Sendjemib","Senenmut","Sen-nefer","Setau","Setka","Sihathor","Simontu","Surero","Tchanun","Tchay","Teni-menu","Thaneni","Theshen","Thethi","Thuity","Ti, Tiy","Tia","Tjuroy","Tuta","Urhiya","Userhat","Wahneferhotep","Wajmose","Wenamon","Weni","Wenisankh","Unasankh","Weshptah","Woser","Yey ","Yuf","Yuia","Yuny","Yuya","Zezemonekh"};
	
	private String name;
	private int gold = 2400;
	private int potionPrice = 1;
	private int flatPrice = 30;
	
	Trader(){
		this.setName(traderNames[getRndInt(0,traderNames.length-1)]);
	}
	
		// return random int with min max input
	static int getRndInt(int min, int max) {
		return new Random().nextInt(max - min + 1) + min;
	}

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
	
	public void trade(Hero hero,Controls controls,City city,World world) throws IOException {
		System.out.println("Hallo ich bin "+this.getName()+" ein Haendler unserer schönen Stadt. Ich biete nur die besten Waren für Reisende an.\n");
		while(controls.isNextTrade()==false) {
		System.out.println("Für dich habe ich Heiltraenke für "+this.getPotionPrice()+" Gold pro Trank.\n");
		if(hero.isOwnFlat()==false) {
			System.out.println("Oder vielleicht ein schönes Zimmer für "+this.getFlatPrice()+" Gold in einer Lehmhuette am Rand der Stadt?");
		}
		world.setTime(2);
		System.out.println("1 - Heiltrank kaufen "+this.getPotionPrice()+" Gold");
		if(city.house.isOwned()==false) {
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
		}else if(action.equals("2")&&city.house.isOwned()==false) {
			if(hero.getGold()>=this.getFlatPrice()) {
				hero.setGold(hero.getGold()-this.getFlatPrice());
				city.house.setOwned(true);
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
