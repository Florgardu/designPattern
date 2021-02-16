package decorator;

public class ArmourDecorator extends EnemyDecorator {

	public ArmourDecorator(Enemy enemigo) {
		super(enemigo);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int takeDamage() {
		// TODO Auto-generated method stub
		int damage= this.enemigo.takeDamage();
		return (damage/2);
		
	
}
	
}
