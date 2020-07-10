package adventure;

public class AdventureTime {

	public static void main(String[] args) {
		World world = new World();
		Adventurer hero = new Adventurer();
		Monster monster = new Monster();
		
		world.setTime(true);
		world.setTime(false);
		System.out.println(world.getTime());
		Fight(hero, monster);
	}
	
	
	public static void Fight(Adventurer hero,Monster monster) {
		
	}

}