package ml.schulzke.pizza;

public class Cheese extends ATopping{

	public Cheese(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 195;
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
