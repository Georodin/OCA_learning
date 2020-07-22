package ml.schulzke.bauernhof.fauna;

public class Kuh extends Saeugetier{

	public Kuh() {
		super(true, 0, "unnamed", 2);
	}

	public Kuh(boolean female, int age, String name) {
		super(female, age, name, 2);
	}
	
}
