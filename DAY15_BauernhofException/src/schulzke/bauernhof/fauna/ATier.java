package schulzke.bauernhof.fauna;

import schulzke.bauernhof.TierZuLeichtException;
import schulzke.bauernhof.flora.AEssen;

public abstract class ATier {
	private String name;
	private int gewicht;
	private int gewichtMin;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewicht() {
		return gewicht;
	}
	private void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public int getGewichtMin() {
		return gewichtMin;
	}
	private void setGewichtMin(int gewichtMin) {
		this.gewichtMin = gewichtMin;
	}
	public ATier(String name, int gewicht, int gewichtMin) {
		super();
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGewichtMin(gewichtMin);
	}
	public abstract void machtGeraeusch();
	public void laeuft() {
		if(this.getGewicht()>=this.getGewichtMin()) {
			System.out.println(this.getName()+" laeuft");
			this.setGewicht(this.getGewicht()-1);
		}else {
			throw new TierZuLeichtException(this);
		}
	}
	
	public void isst(AEssen essen) {

		essen.wirdGegessen();
		System.out.println(this.getName()+" hat gegessen!");
		this.setGewicht(this.getGewicht()+essen.getNaehrwert());
	}
}
