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
	
		
		// creo un nuevo Combo, que contiene otros combos “Súper Mc Chombos”-“Súper Mc Chombo 1” que tiene adentro dos “Mc
		//Chombos 1”.
		
		Combo SuperChombo1= new Combo("Super Mc Chombo 1");
		SuperChombo1.addProducto(mcChombo1);
		SuperChombo1.addProducto(mcChombo1);
		
		// creo un  “Súper Requete Mc Chombos”,  contienen adentro otros Mc Chombos y Súper Mc Chombos. Por ejemplo, el “Súper Requete Mc
		// Chombo 1” que tiene adentro un “Mc Chombos 1” y un “Súper Mc Chombo 1”
		
		Combo SuperRequeteMcChombo= new Combo ("Super Requete Mc Chombo 1");
		SuperRequeteMcChombo.addProducto(mcChombo1);
		SuperRequeteMcChombo.addProducto(SuperChombo1);

		
		
		// creo un Ticket
		
		Ticket ticket= new Ticket();
		
		// le agrego items , es decir producto y cantidades - Pruebo agregar combos y productos sueltos 
		
		ticket.agregarItem(mcChombo1, 1);
		ticket.agregarItem(mcChombo2, 1);
		ticket.agregarItem(papas, 2);
		ticket.agregarItem(SuperChombo1, 1);
		ticket.agregarItem(SuperRequeteMcChombo, 1);
		ticket.agregarItem(SuperRequeteMcChombo, 2);

		
		
		
		// imprimo el ticket/factura total
		
		ticket.imprimirFactura();
		
		
		
		
		
	
}
	
}
