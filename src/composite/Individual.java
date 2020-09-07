package composite;

public class Individual extends Producto {

	public Individual(double precio, String nombre) {
		super(nombre);
		this.precio= precio;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.precio;
	}

}
