package ml.schulzke.bauernhof.fauna;

import ml.schulzke.bauernhofMain.BauerMain;

public class Saeugetier extends BauerMain {
	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Saeugetier() {
		this(true, 0, "unnamed", 0);
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Saeugetier(boolean female, int age, String name, int type) {
		super();
		this.female = female;
		this.age = age;
		this.name = name;
		this.type = type;
	}

	boolean female;
	int age;
	String name;
	int type;
	
	public Saeugetier procreate(Saeugetier two) throws Exception{
		
		Saeugetier one = this;
		
		if(one.getType()!=two.getType()) {
			System.out.println("Keine Kreuzungen!");
			//throw new Exception();
		}else if(one.getAge()<1) {
			System.out.println(one.getName()+" ist nicht alt genug!");
			//throw new Exception();
		}else if(two.getAge()<1) {
			System.out.println(two.getName()+" ist nicht alt genug!");
			//throw new Exception();
		}else if(one.isFemale()==two.isFemale()) {
			System.out.println("ein Weibchen ein Maennchen, anders geht das nicht...");
			//throw new Exception();
			
		}else{
			if(one.getType()==1) {
				System.out.println("neues Ferkel gezeugt");
				return new Schwein();
				//neues schwein
			}else {
				System.out.println("neues Kalb gezeugt");
				return new Kuh();
				//neues kalb
			}
		}
		
		return null;
		
	}
}
