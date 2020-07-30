package schulzke.bauernhof.flora;

import schulzke.bauernhof.EssenIstWegException;
import schulzke.bauernhof.IEssbar;

public abstract class AEssen implements IEssbar{
	
	private String name;
	private int naehrwert;
	private int anzahl;
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getNaehrwert() {
		return naehrwert;
	}

	private void setNaehrwert(int naehrwert) {
		this.naehrwert = naehrwert;
	}

	public int getAnzahl() {
		return anzahl;
	}

	private void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
	AEssen(String name, int naehrwert, int anzahl) {
		super();
		this.setName(name);
		this.setNaehrwert(naehrwert);
		this.setAnzahl(anzahl);
	}
	
	public void wirdGegessen() {
		if(this.getAnzahl()>=1) {
		this.setAnzahl(this.getAnzahl()-1);
			System.out.println(this.getName()+" wurde gegessen noch "+this.getAnzahl()+" uebrig");
		}else {
			throw new EssenIstWegException(this);
		}
	}
}
