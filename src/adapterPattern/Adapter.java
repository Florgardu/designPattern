package adapterPattern;

public class Adapter extends BingMaps{
	
	private GMaps gmaps;
	
	
	public Adapter(GMaps gmaps) {
		super();
		this.gmaps = gmaps;
	}


	public void getDireccion(String longitud, String latitud) {
		gmaps.darDire(latitud, longitud);
	}

	

}
