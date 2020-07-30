package schulzke.bauernhof.flora;

public class Ruebe extends AEssen{
	
	private String farbe;
	
	private String getFarbe() {
		return farbe;
	}

	private void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	Ruebe(String name, int naehrwert, int anzahl) {
		super(name, naehrwert, anzahl);
		this.setFarbe("lila");
	}
	
}