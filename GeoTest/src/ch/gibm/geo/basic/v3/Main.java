package ch.gibm.geo.basic.v3;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GeoManager mgr = new GeoManager();
		mgr.addObj(new Dreieck(100,20));
		mgr.addObj(new Dreieck(200,30));
		mgr.addObj(new Dreieck(300,40));
		mgr.addObj(new Rechteck(20,30));
		mgr.addObj(new Rechteck(60,90));
		
		mgr.print();
	}

}
