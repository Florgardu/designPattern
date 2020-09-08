package factoryMethod;

public abstract class Juguete {

	private String nombre;
	

	public Juguete(String nombre) {
		this.nombre = nombre;
	}


	public abstract void jugar();
	
}
