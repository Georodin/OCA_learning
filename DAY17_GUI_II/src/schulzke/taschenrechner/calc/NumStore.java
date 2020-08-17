package schulzke.taschenrechner.calc;

public class NumStore {

	private String numA;
	private String numB;
	private boolean isNumA;

	public String getNumA() {
		return numA;
	}

	public void setNumA(String numberA) {
		this.numA = numberA;
	}
	
	public void addNumA(String numberA) {
		this.numA = this.numA+numberA;
	}

	public String getNumB() {
		return numB;
	}

	public void setNumB(String numberB) {
		this.numB = numberB;
	}
	
	public void addNumB(String numberB) {
		this.numB = this.numB+numberB;
	}
	
	public boolean isNumA() {
		return isNumA;
	}

	public void setIsNumA(boolean isNumA) {
		this.isNumA = isNumA;
	}

	public NumStore(){
		this.setNumA("0");
		this.setNumB("");
		this.setIsNumA(true);
	}
	
	
}
