package schulzke;

public class OfenMain {

	public static void main(String[] args) throws InterruptedException {
		Ofen ofen = new Ofen();
		System.out.println(ofen);
		
		Holz holz = new Holz();
		Holzkohle holzkohle = new Holzkohle();
		Steinkohle steinkohle = new Steinkohle();
		Magnesium magnesium = new Magnesium();
		
		holz.brennt(ofen);
		holzkohle.brennt(ofen);
		steinkohle.brennt(ofen);
		steinkohle.brennt(ofen);
		steinkohle.brennt(ofen);
		steinkohle.brennt(ofen);
		magnesium.brennt(ofen);
		magnesium.brennt(ofen);
		magnesium.brennt(ofen);
		magnesium.brennt(ofen);
		steinkohle.brennt(ofen);
		steinkohle.brennt(ofen);
		steinkohle.brennt(ofen);
		magnesium.brennt(ofen);
		magnesium.brennt(ofen);
		}

}
