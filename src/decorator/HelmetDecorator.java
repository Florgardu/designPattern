package decorator;

public class HelmetDecorator extends EnemyDecorator {

	
	public HelmetDecorator(Enemy enemigo) {
		super(enemigo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int takeDamage() {
		// TODO Auto-generated method stub
		return this.enemigo.takeDamage() / 2;
	} 

}
