package factoryEj2;

public class RandomEnemyFactory extends EnemyFactory {

	@Override
	public Entity createEnemy() {
		// TODO Auto-generated method stub
		Entity enemyBoo= new Boo();
		return enemyBoo;
	}

}
