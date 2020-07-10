package ml.schulzke;

public class Dreieck{
	private Punkt p1 = new Punkt();
	private Punkt p2 = new Punkt();
	private Punkt p3 = new Punkt();
public Dreieck(){

	System.out.println ("Dreieck wird erzeugt aus 3 Eckpunkten");

	}
	public double entfernung(Punkt a, Punkt b) {
		//((X1-X2)²) + ((Y1+Y2)²) > Wurzel = Entfernung
		return Math.sqrt(((a.getX()-b.getX())*(a.getX()-b.getX()))+((a.getY()-b.getY())*(a.getY()-b.getY())));
	}
	public double umfang() {
		//((X1-X2)²) + ((Y1+Y2)²) > Wurzel = Entfernung
		return entfernung(this.p1,this.p2)+entfernung(this.p2,this.p3)+entfernung(this.p3,this.p1);
	}
}