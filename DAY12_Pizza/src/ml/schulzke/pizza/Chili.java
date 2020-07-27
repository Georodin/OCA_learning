package ml.schulzke.pizza;

public class Chili extends ATopping{

	public Chili(IPizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.getPrice()+95;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return true;
	}
}
