package schulzke.bauernhof.fauna;

public class Esel extends ATier{

	public Esel(String name, int gewicht, int gewichtMin) {
		super(name, gewicht, gewichtMin);
	}

	@Override
	public void machtGeraeusch() {
		System.out.println("Diablo III ist besser als Diablo II!");
	}
}
