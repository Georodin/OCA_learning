package schulzke.bauernhof;

import schulzke.bauernhof.flora.AEssen;

public class EssenIstWegException extends RuntimeException {

	public EssenIstWegException(AEssen essen) {
		
		
		super("Kein Essen mehr!");
		this.printStackTrace();
		System.out.println("Fehler bei Anzahl von Essen! Versuche nicht vorhandenes Essen zu essen!");
		System.out.println("Betroffnes Essen: "+essen.getName());
		System.out.println("Beende Programm ...");
		System.exit(0);
	}
	

}
