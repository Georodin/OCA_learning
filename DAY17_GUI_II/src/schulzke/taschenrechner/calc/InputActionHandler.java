package schulzke.taschenrechner.calc;

public class InputActionHandler{
	
	public void numericInput(String input, NumStore numStore){
		if(numStore.isNumA()) {
			if(numStore.getNumA().equals("0")) {
				numStore.setNumA("");
			}
			
			if(numStore.getNumA().length()<=19) {
			numStore.addNumA(input);
			}
		}else {
			if(numStore.getNumB().equals("0")) {
				numStore.setNumB("");
			}
			
			if(numStore.getNumB().length()<=19) {
			numStore.addNumB(input);
			}
		}
		
	}
	
	public void operatorInput(String operant,NumStore numStore){
		if(numStore.isNumA()) {
			numStore.setIsNumA(false);
		}else {
			numStore.setIsNumA(true);
		}
	}
	
	public void resultInput(NumStore numStore) {
		double numA = 0;
		double numB = 0;
		if(numStore.getNumA()!="") {
			if((numStore.getNumA().charAt(numStore.getNumA().length()-1)=='.')) {
				numStore.setNumA(numStore.getNumA().substring(0, numStore.getNumA().length() - 1));
				System.out.println(numStore.getNumA());
			}
			numA = Double.parseDouble(numStore.getNumA());
		}
		if(numStore.getNumB()!="") {
			if((numStore.getNumB().charAt(numStore.getNumB().length()-1)=='.')) {
				numStore.setNumB(numStore.getNumB().substring(0, numStore.getNumB().length() - 1));
			}
			numB = Double.parseDouble(numStore.getNumB());
		}
		
		double result = numA+numB;
		
		System.out.println(numA);
		//rechnen
		
		String strNumA = ""+result;
		
		//check if number ends with .0 if yes remove .0
		if(((strNumA).charAt((strNumA).length()-2)=='.')&&((strNumA).charAt((strNumA).length()-1)=='0')) {
			strNumA = strNumA.substring(0, strNumA.length() - 2);
		}
		
		
		numStore.setNumA(strNumA);
	}
	
	public void pointInput(NumStore numStore) {
		if((numStore.getNumA().length()<=18)&&(numStore.getNumA().indexOf(".")==-1)) {
			numStore.addNumA(".");
		}
	}
	
	public void invertInput(NumStore numStore) {
		if(!numStore.getNumA().equals("0")&&(numStore.getNumA().indexOf("-")==-1)) {
			numStore.setNumA("-"+numStore.getNumA());
		}else if(numStore.getNumA().indexOf("-")!=-1) {
			numStore.setNumA(numStore.getNumA().substring(1));
		}
	}
	
	public void deleteInput(NumStore numStore) {
		numStore.setNumA(numStore.getNumA().substring(0, numStore.getNumA().length() - 1));
		if(numStore.getNumA().length()==0||numStore.getNumA().equals("-")) {
			numStore.setNumA("0");
		}
	}
	
	public void resetInput(NumStore numStore) {
		numStore.setNumA("0");
		numStore.setNumB("0");
		numStore.setIsNumA(true);
	}
}
