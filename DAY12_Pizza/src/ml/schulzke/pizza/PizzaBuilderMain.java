package ml.schulzke.pizza;

public class PizzaBuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPizza pizza = new CrustyDough();
		pizza = new Chili(pizza);
		System.out.println(pizza.getPrice());
	}
}
