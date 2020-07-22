package ml.schulzke.bauernhofMain;
import ml.schulzke.bauernhof.fauna.*;

public class BauerMain {

	public static void main(String[] args) throws Exception {
		Saeugetier s1 = new Schwein(true, 4, "Grunz1 F");
		Saeugetier s2 = new Schwein(false, 5, "Grunz2 M");
		Saeugetier s3 = new Schwein(false, 1, "Grunz3 M");
		Saeugetier k1 = new Kuh(true, 3, "Muh1 F");
		Saeugetier k2 = new Kuh(false, 7, "Muh2 M");
		Saeugetier k3 = new Kuh(false, 4, "Muh3 M");
		
		Saeugetier s4 = s1.procreate(k1); //Grunz F + Kuh F
		Saeugetier k4 = k2.procreate(k3); //Kuh M + Kuh M
		Saeugetier s5 = s1.procreate(s2); 
		Saeugetier k5 = k1.procreate(k2);
		Saeugetier s6 = s1.procreate(s5);
		Saeugetier k6 = k1.procreate(k5);
	}


}
