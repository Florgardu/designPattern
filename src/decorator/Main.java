package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// enemigo base, es decir componente concreto sin decorar
		
		
		Enemy enemigoBase= new EnemigoBase ();
		
		
		int damaged= enemigoBase.takeDamage();
		System.out.println(damaged);
		
		
		// QUIERO AGREGARLE COMPORTAMIENTO, AÑADIRLE COSAS SIN TENER QUE RE-IMPLEMENTAR UNA 
	//	CLASE CONCRETA DE ENEMIGO POR CADA POSIBLE COMBINACIÓN 
		
		// decoro al enemigo base para que tenga casco 
		
		Enemy enemigoConCasco= new HelmetDecorator(enemigoBase);
		
		int damagedDecoratorCasco=enemigoConCasco.takeDamage();
		System.out.println(damagedDecoratorCasco);
		
		
		Enemy enemigoConArmadura= new ArmourDecorator(enemigoConCasco);
		int damagedDecoratorCascoArmadura=enemigoConArmadura.takeDamage();
		System.out.println(damagedDecoratorCascoArmadura);
		
	}

}
