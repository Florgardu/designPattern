package factoryMethod;

public class MoldeAvion implements Molde  {

	@Override
	public Juguete crear() {
		// TODO Auto-generated method stub
		AvionDeJuguete avioncito = new AvionDeJuguete("Avión de plastico");
		return avioncito;
	}
	
	
	

}
