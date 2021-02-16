package decorator;

public abstract class EnemyDecorator implements Enemy {

	
	protected Enemy enemigo;   //este enemigo puede ser tmb un enemyDecorator ya decorado
	
	 
	public EnemyDecorator(Enemy enemigo) {
		this.enemigo = enemigo;
	}
	
	@Override
	public int takeDamage() {
		// TODO Auto-generated method stub
		return this.enemigo.takeDamage();
	} 
	
}
