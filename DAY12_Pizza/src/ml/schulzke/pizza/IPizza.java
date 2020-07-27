package ml.schulzke.pizza;

public interface IPizza {
	int getPrice(); // Preis in Cent
	boolean isVegetable(); // Pizza ist vegetarisch?
	boolean isHot(); // Pizza ist scharf?
}

