package ml.schulzke.pizza;

public class Peperoni extends ATopping{

	public Peperoni(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 225;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return true;
	}
}
