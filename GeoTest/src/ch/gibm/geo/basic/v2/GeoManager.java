package ch.gibm.geo.basic.v2;

import java.util.ArrayList;
import java.util.List;

public class GeoManager {


	private List<GeoObjekt> geoObjects = new ArrayList<GeoObjekt>();

	public void addObj(GeoObjekt obj) {
		this.geoObjects.add(obj);
	}
	
	public void print() {
		for(GeoObjekt g : this.geoObjects) {
			System.out.println("Fläche: " + g.berechneFlaeche());
		}
	
	}
}