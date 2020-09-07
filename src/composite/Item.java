package composite;

public class Item {

	private Producto producto;
	private int cantidad;
	
	
	public Item(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}


	public Producto getProducto() {
		return producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double GetPrecioItem()
    {
        return producto.getPrecio() * this.cantidad;
    }
	
	public void getLineaItem() {
		System.out.println(this.cantidad + " " + producto.getNombre() +  " ($ " + producto.getPrecio() + " )  -total:  $"  + this.GetPrecioItem());
		
	}
	
	
}
