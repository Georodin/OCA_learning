package schulzke.bauernhof;

import schulzke.bauernhof.fauna.ATier;
import schulzke.bauernhof.fauna.Schwein;
import schulzke.bauernhof.flora.AEssen;
import schulzke.bauernhof.flora.Moehre;

public class Bauernhof {

	public static void main(String[] args) {
		
	try {
		//Piggy = name, 30 = startgewicht in kg, 15 = minimal gewicht
		ATier schwein = new Schwein("Piggy",30,15);
		
		//1 = naehrwert in kg, 10 = anzahl
		AEssen moehre = new Moehre(1,10);
		
		/* remove comment fuer exception test
		schwein.setName(null);
		schwein.getName().toLowerCase();
		*/
		
		//i<20 fuer exception test
		for (int i=0;i<5;i++) {
			schwein.laeuft();
		}
		
		//i<20 fuer exception test
		for (int i=0;i<5;i++) {
			schwein.isst(moehre);
		}

		
	} catch (Exception e) {
		System.out.println("Unbekannter Fehler aufgetreten - bitte kontaktieren Sie den Support");
		System.out.println("Mo-Di 10:45 bis 11:00 Uhr | 2,99€ pro angebrochener Minute");
		e.printStackTrace();
		System.out.println("Beende Programm ...");
		System.exit(0);
	}
	}

}
