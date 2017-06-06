package ch.gibm.geo.basic.v3;

public class Rechteck implements GeoObjekt {

	private double laenge;
	private double breite;
	
	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
		
	}
	
	@Override
	public double berechneFlaeche() {
		return this.laenge * this.breite;
	}

}
