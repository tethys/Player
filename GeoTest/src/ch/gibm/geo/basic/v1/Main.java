package ch.gibm.geo.basic.v1;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GeoManager mgr = new GeoManager();
		mgr.addObj(new Dreieck(100,20));
		mgr.addObj(new Dreieck(200,30));
		mgr.addObj(new Dreieck(300,40));
		mgr.print();
	}

}
