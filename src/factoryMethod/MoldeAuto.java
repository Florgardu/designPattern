package factoryMethod;

public class MoldeAuto implements Molde {
	
	@Override
	public Juguete crear() {
		// TODO Auto-generated method stub
		AutoDeJuguete autito = new AutoDeJuguete("Avión de plastico");
		return autito;
	}
	
	

}
