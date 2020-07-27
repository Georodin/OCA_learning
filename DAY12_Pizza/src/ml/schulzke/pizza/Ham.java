package ml.schulzke.pizza;

public class Ham extends ATopping{

	public Ham(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 245;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return false;
	}
}
