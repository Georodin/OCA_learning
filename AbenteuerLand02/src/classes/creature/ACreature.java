package classes.creature;

public abstract class ACreature implements IFighting{
	String name;
	int level;
	int baseStrength;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getBaseStrength() {
		return baseStrength;
	}

	public void setBaseStrength(int baseStrength) {
		this.baseStrength = baseStrength;
	}
	
	public ACreature(String name, int level, int baseStrength) {
		super();
		this.name = name;
		this.level = level;
		this.baseStrength = baseStrength;
	}
	
}
