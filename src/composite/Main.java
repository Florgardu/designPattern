package composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo productos individuales
		
		Producto hamburguesa = new Individual(50, "Big Mac");
		Producto papas = new Individual(25, "Papas Fritas");
		Producto gaseosa = new Individual(10, "Coca Cola");

		
		// creo combo agregandole productos
		
		Combo mcChombo1 = new Combo("Chombo 1");
		mcChombo1.addProducto(hamburguesa);
        mcChombo1.addProducto(papas);
        mcChombo1.addProducto(gaseosa);


		Combo mcChombo2 = new Combo("Chombo 2");
		mcChombo2.addProducto(hamburguesa);
		mcChombo2.addProducto(gaseosa);
	
		
		// creo un Ticket
		
		Ticket ticket= new Ticket();
		
		// le agrego items , es decir producto y cantidades - Pruebo agregar combos y productos sueltos 
		
		ticket.agregarItem(mcChombo1, 1);
		ticket.agregarItem(mcChombo2, 1);
		ticket.agregarItem(papas, 2);

		
		// imprimo el ticket/factura total
		
		ticket.imprimirFactura();
		
		
	
}
	
}
