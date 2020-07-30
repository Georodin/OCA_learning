package schulzke;

public abstract class Brennstoff implements IBrennbar{
	
	static void printOutro() throws InterruptedException{
		String[] intro = {	"",
						"   _.-^^---....,,--__     ",
						" _--                  --_  ",
						"<                        >)",
						"|                         | ",
						" \\._                   _./  ",
						"    ```--. . , ; .--'''       ",
						"          | |   |       "      ,
						"       .-=||  | |=-.   ",
						"       `-=#$%&%$#=-'   ",
						"          | ;  :|     		",
						" _____.,-#%&$@%#&#~,._____"
							};
	                   
	   for(String entry : intro) {
			Thread.sleep(180);
		   System.out.println(entry);
	   }                
	}        
	
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getTemperatureRaise() {
		return temperatureRaise;
	}

	private void setTemperatureRaise(int temperatureRaise) {
		this.temperatureRaise = temperatureRaise;
	}

	String name;
	int temperatureRaise;
	
	public Brennstoff(String name, int temperatureRaise) {
		super();
		this.setName(name);
		this.setTemperatureRaise(temperatureRaise);
	}
	
	public void brennt(Ofen ofen) throws InterruptedException{
		String stringOut = "";

		
		
		try {
				if(ofen.getTemperatur()<ofen.getMaxTemperatur()) {
					ofen.setTemperatur(ofen.getTemperatur()+this.getTemperatureRaise());
					stringOut = "Aktuelle Temperatur im Warpkern steigt um "+this.getTemperatureRaise()+"°C durch hinzugabe von \""+this.getName()+"\"! \n"+
								"Temperatur: 		"+ofen.getTemperatur()+"°C\n"+
								"Max Temperatur:		"+ofen.getMaxTemperatur()+"°C\n";
					if(ofen.getTemperatur()>=ofen.getMaxTemperatur()) {
						ofen.setUseable(null);
					}
				}else {
					ofen.setUseable(null);
				}
		ofen.getUseable().toUpperCase();
		} catch(Exception e) {
			stringOut = "Aktuelle Temperatur im Warpkern steigt um "+this.getTemperatureRaise()+"°C durch hinzugabe von \""+this.getName()+"\"! \n"+
						"Temperatur: 		"+ofen.getTemperatur()+"°C\n"+
						"Warpkern-Temperatur hat "+ofen.getMaxTemperatur()+"°C ueberschritten.\n";
			if(ofen.isSaftey()) {
				ofen.setTemperatur(ofen.getTemperatur()-200);
				stringOut += 	"\n---Notfall-System---\n"+
								"Plasma Kuehlmittel wird eingeleitet!\n"+
								"Aktuelle Temperatur im Warpkern sinkt um 200°C durch hinzugabe von \"Plasma Kuehlmittel\"! \n"+
								"Temperatur: 		"+ofen.getTemperatur()+"°C\n";
				ofen.setSaftey(false);
			}
			if(ofen.getTemperatur()>=ofen.getMaxTemperatur()) {
				stringOut += "Warpkern wurde zerstoert! \"fascinating\" - Leonard Nimoy\n";
				System.out.println(stringOut);
				printOutro();
				System.exit(1);
			}else {
				ofen.setUseable("t");
			}
			System.out.println(stringOut);	
			
			
			
		}

		System.out.println(stringOut);
	}
}
