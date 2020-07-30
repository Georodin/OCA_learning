package schulzke;

public class Ofen {
	int temperatur;
	int maxTemperatur;
	String useable;
	boolean saftey;
	
	public boolean isSaftey() {
		return saftey;
	}
	public void setSaftey(boolean saftey) {
		this.saftey = saftey;
	}
	public String getUseable() {
		return useable;
	}
	public void setUseable(String useable) {
		this.useable = useable;
	}
	public int getTemperatur() {
		return temperatur;
	}
	public void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
	}
	public int getMaxTemperatur() {
		return maxTemperatur;
	}
	private void setMaxTemperatur(int maxTemperatur) {
		this.maxTemperatur = maxTemperatur;
	}
	
	public Ofen(int temperatur) {
		super();
		this.setTemperatur(temperatur);
		this.setMaxTemperatur(2000);
		this.setUseable("t");
		this.setSaftey(true);
	}
	
	public Ofen() {
		this(300);
	}
	
	@Override
	public String toString() {
		String stringOut = "";
		
				stringOut = "Aktuelle Temperatur im Ofen: \n"+
							"Temperatur: 		"+this.getTemperatur()+"°C\n"+
							"Max Temperatur:		"+this.getMaxTemperatur()+"°C\n";
		
		return stringOut; 
		

	}
	
	public void verbrennen(IBrennbar brennbar) {
		
	}
	
}
