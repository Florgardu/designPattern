package composite;

import java.util.ArrayList;

public class Ticket {

	private ArrayList<Item> items = new ArrayList<Item>();
	

	
	public void imprimirFactura () {
		double total=0;
		for (Item item : items) {
			item.getLineaItem();
			total= total + item.GetPrecioItem();
		}
		System.out.println("Total: $" + total);
	}
	
	
	public void agregarItem(Producto producto, int cantidad) {
		 this.items.add(new Item(producto, cantidad));
		
	}
	
}
