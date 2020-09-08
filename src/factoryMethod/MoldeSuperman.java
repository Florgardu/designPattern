package factoryMethod;

public class MoldeSuperman implements Molde {

	
	
	@Override
	public Juguete crear() {
		// TODO Auto-generated method stub
		SuperManDeJuguete superman= new SuperManDeJuguete("clark kent");
		return superman;
	}

	
	
	
}
