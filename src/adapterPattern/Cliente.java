package adapterPattern;

public class Cliente {
	
	private BingMaps mapa;

	public void setMapa(BingMaps mapa) {
		this.mapa = mapa;
	}
	
	public void buscarDireccionEnMapa(String longitud, String latitud) {
		mapa.getDireccion(longitud, latitud);
	}

}
