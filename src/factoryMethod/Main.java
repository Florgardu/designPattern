package factoryMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creo una maquina 
		
		Maquina maquina= new Maquina();
		
		// creo dos moldes 
		
		Molde moldeAvion= new MoldeAvion();
		
		Molde moldeAuto= new MoldeAuto();

		// le seteo un molde a la maquina
		
		maquina.agregarMolde(moldeAuto);
		
		// fabrico un autito de juguete
		
		Juguete jugueteNuevo= maquina.fabricar();
		jugueteNuevo.jugar();
		
		
		// ahora le cambio el molde 
		
		maquina.agregarMolde(moldeAvion);
		
		// fabrico con nuevo molde 
		
		Juguete jugueteNuevo2= maquina.fabricar();
		jugueteNuevo2.jugar();

		
		// creo un nuevo molde un juguete nuevo 
		
		Molde moldeSuperman = new MoldeSuperman();
		
		// lo cambio en la maquina
		
		maquina.cambiarMolde(moldeSuperman);
		
		// pruebo fabricar con nuevo molde de nuevo juguete
		
		Juguete jugueteNuevo3=maquina.fabricar();
		jugueteNuevo3.jugar();
		
		
	}

}
