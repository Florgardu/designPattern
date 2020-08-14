package strategyDuckSim;

public class MallardQuack extends Duck {
	

	public MallardQuack() {
		flyBehavior= new FlyWithWing();
		quackBehavior= new Quack();
		// TODO Auto-generated constructor stub
	}

	
}
