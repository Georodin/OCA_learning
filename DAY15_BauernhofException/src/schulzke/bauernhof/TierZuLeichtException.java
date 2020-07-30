package schulzke.bauernhof;

import schulzke.bauernhof.fauna.ATier;

public class TierZuLeichtException extends RuntimeException {

	public TierZuLeichtException(ATier tier) {
		
		
		super("Tier untergewichtig");
		this.printStackTrace();
		System.out.println("Gewicht bei Fehler: "+tier.getGewicht()+"kg von minimal "+tier.getGewichtMin()+"kg");
		System.out.println("Betroffnes Tier: "+tier.getName());
		System.out.println("Beende Programm ...");
		System.exit(0);
	}
	

}