package composite;

import java.util.ArrayList;

public class Combo extends Producto {

	private ArrayList<Producto> productos = new ArrayList<Producto>();


	public Combo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double getPrecio() {
		double precioTotal = 0;
		for (Producto producto : productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

	  public void addProducto (Producto producto)
      {
          productos.add(producto);
      }
	
	
}
