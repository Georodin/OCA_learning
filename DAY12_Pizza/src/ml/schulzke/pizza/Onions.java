package ml.schulzke.pizza;

public class Onions extends ATopping{

	public Onions(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 65;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return false;
	}
}
