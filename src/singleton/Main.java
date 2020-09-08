package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Singleton s=	Singleton.getInstance();
		
	Singleton sa=	Singleton.getInstance();
	Singleton s2=	Singleton.getInstance();

	System.out.println(s);
	System.out.println(sa);
	System.out.println(s2);

	
	}

}
