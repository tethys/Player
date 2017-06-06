package ch.gibm.geo.basic.v3;

public class Dreieck implements GeoObjekt {

	private int grundflaeche;
	private int hoehe;
	
	public Dreieck(int grundflaeche, int hoehe) {
		super();
		this.grundflaeche = grundflaeche;
		this.hoehe = hoehe;
	}
	
	public double berechneFlaeche() {
		return (this.grundflaeche * this.hoehe) / 2;
	}
}