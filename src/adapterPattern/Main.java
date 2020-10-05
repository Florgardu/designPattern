package adapterPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente cliente= new Cliente();
		BingMaps mapaMicrosoft= new BingMaps();
		cliente.setMapa(mapaMicrosoft);
		cliente.buscarDireccionEnMapa("1", "15");
		
		cliente.setMapa(new Adapter(new GMaps()));
		cliente.buscarDireccionEnMapa("1", "15");

		
	}

}
