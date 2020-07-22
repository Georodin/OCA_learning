package ml.schulzke.bauernhof.fauna;

public class Schwein extends Saeugetier{
	public Schwein() {
		super(true, 0, "unnamed", 1);
	}

	public Schwein(boolean female, int age, String name) {
		super(female, age, name, 1);
	}
}
