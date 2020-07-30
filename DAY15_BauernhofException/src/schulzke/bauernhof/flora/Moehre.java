package schulzke.bauernhof.flora;

public class Moehre extends AEssen{
	
	private int laenge;
	
	private int getLaenge() {
		return laenge;
	}

	private void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public Moehre(int naehrwert, int anzahl) {
		super("Moehre", naehrwert, anzahl);
		this.setLaenge(15);
	}
	
}
