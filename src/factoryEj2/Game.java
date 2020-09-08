package factoryEj2;

public class Game {
	
	private EnemyFactory enemys;

	public Game(EnemyFactory enemys) {
		this.enemys = enemys;
	}
	
	
	public void createEnemy() {
		Entity enemy= enemys.createEnemy();
	}


	public void setEnemys(EnemyFactory enemys) {
		this.enemys = enemys;
	}



	
	

}
