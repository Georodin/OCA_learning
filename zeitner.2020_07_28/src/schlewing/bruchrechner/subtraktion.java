package schlewing.bruchrechner;

public class subtraktion {
	private String bruch1;
	private String bruch2;

subtraktion () {
	}

subtraktion (String bruch1, String bruch2) {
	this.setBruch1(bruch1);
	this.setBruch2(bruch2);
	}

public void setBruch1(String bruch1) {
	this.bruch1 = bruch1;
	}

public void setBruch2(String bruch2) {
	this.bruch2 = bruch2;
	}

public int[] getErgebnis() {
	String z1_str;
	String n1_str;
	String z2_str;
	String n2_str;
	
	z1_str = bruch1.substring(0,bruch1.indexOf("/"));
	n1_str = bruch1.substring(bruch1.indexOf("/")+1,bruch1.length());
	z2_str = bruch2.substring(0,bruch2.indexOf("/"));
	n2_str = bruch2.substring(bruch2.indexOf("/")+1,bruch2.length());
	
	int z1;
	int n1;
	int z2;
	int n2;
	
	z1 = Integer.parseInt(z1_str);
	n1 = Integer.parseInt(n1_str);
	z2 = Integer.parseInt(z2_str);
	n2 = Integer.parseInt(n2_str);
	
	int z_ergebnis = 0;
	int n_ergebnis = 0;
	int [] ergebnis;
	ergebnis = new int[2];
	
	z_ergebnis = (z1*n2) - (z2*n1);
	n_ergebnis = (n1*n2);
	ergebnis[0] = z_ergebnis;
	ergebnis[1] = n_ergebnis;
	
	return ergebnis;
}
}