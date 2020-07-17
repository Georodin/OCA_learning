package ml.schulzke;

public class DEMO_MARRY {
	
	public static void main(String[] args) {
		
		City[] city = new City[3];
		Hero hero = new Hero();
		
		city[0] = new City("Men-nefer",290,165);
		city[1] = new City("Heliopolis",262,170);
		city[2] = new City("Merimda",250,130);
		
		System.out.println(city[0].distance(hero));
		System.out.println(city[1].distance(hero));
		System.out.println(city[2].distance(hero));
		
		array();
	}

	
	public static void array() {
		int[][][] test = {
				{
					{1, 2, 3}, 
				    {4, 5, 6},
				    {7,8,9}
				},{
			        {10, 11, 12}, 
			        {13, 14, 15},
			        {16, 17, 18}
				},{
					{19, 20, 21}, 
			        {22, 23, 24},
			        {25, 26, 27}
				} 
		};
		
	for (int i = 0;i<test.length;i++) {
		for (int j = 0;j<test[i].length;j++) {
			for (int b = 0;b<test[i][j].length;b++) {
				System.out.print(" ["+i+"]["+j+"]["+b+"]");
				System.out.print(" = "+test[i][j][b]+" \n");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	}
}

