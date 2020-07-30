package schulzke.bauernhof.fauna;

public class Schwein extends ATier{

	public Schwein(String name, int gewicht, int gewichtMin) {
		super(name, gewicht, gewichtMin);
	}

	@Override
	public void machtGeraeusch() {
		System.out.println("Grunz! Grunz!");
	}
}
