package ml.schulzke;

/*
Objektorientierter Bruchrechner
für die Rechenarten : +,-,*,:
Probeausgabe für 1/2 und 1/3:

1/2 * 1/3 = 1/6 (z1*z2/n1*n2)
1/2 : 1/3 = 3/2 (b1/kehrwert(b2)
1/2 + 1/3 = 5/6 (z1*n2+z2*n1 / n1*n2)
1/2 - 1/3 = 1/6 (z1*n2-z2*n1 / n1*n2)
*/

public class Main {
	
	public static void main(String[] args) {
	String in1 = "1/2";
	String in2 = "1/3";
	String[] in1Process = in1.split("/");
	String[] in2Process = in2.split("/");
	//int	denominator2 = ;
	System.out.println(in1Process[0]);
	System.out.println(in1Process[1]);
	System.out.println(in2Process[0]);
	System.out.println(in2Process[1]);
	}

}
