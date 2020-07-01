package variablen;
public class DemoCasting {
	public static void main(String[] args) {
		
		/*Implizites Casting > Widening Casting
		Widening Casting (automatically) - converting a smaller type to a larger type size
		byte -> short -> char -> int -> long -> float -> double*/
	    int myInt1 = 9;
	    double myDouble1 = myInt1; // Automatic casting: int to double
	
	    System.out.println(myInt1);      // Outputs 9
	    System.out.println(myDouble1);   // Outputs 9.0
	    
	    /*Explizites Casting > Narrowing Casting
	    Narrowing Casting (manually) - converting a larger type to a smaller size type
	    double -> float -> long -> int -> char -> short -> byte*/
	    double myDouble2 = 9.78;
	    int myInt2 = (int) myDouble2; // Manual casting: double to int
	
	    System.out.println(myDouble2);   // Outputs 9.78
	    System.out.println(myInt2);      // Outputs 9
	}
}