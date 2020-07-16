package ml.schulzke;

public class DEMO_MARRY {
	
	public static void main(String[] args) {
		City[] city = new City[3];
		Hero hero = new Hero();
		
		city[0] = new City("Men-nefer",15,15);
		city[1] = new City("Men-nefer1",20,20);
		city[2] = new City("Men-nefer2",25,25);
		
		System.out.println(city[0].distance(hero));
		System.out.println(city[1].distance(hero));
		System.out.println(city[2].distance(hero));
	}
}
