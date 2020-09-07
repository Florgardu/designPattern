package composite;

public abstract class Producto {

	protected double precio;
	private String nombre;

	public Producto(String nombre) {
		this.nombre=nombre;
	}

	public abstract double getPrecio();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
