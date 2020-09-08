package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// la primera vez lo crea
	Singleton s=	Singleton.getInstance();
		
	// ahora siempre me devuelve la misma instancia 
	Singleton sa=	Singleton.getInstance();
	Singleton s2=	Singleton.getInstance();

	// todos apuntan a la misma dirección de memoria, puntero
	System.out.println(s);
	System.out.println(sa);
	System.out.println(s2);

	
	}

}
