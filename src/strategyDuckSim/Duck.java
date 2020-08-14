package strategyDuckSim;

public abstract class Duck {

	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	


	public void performQuack() {

		this.quackBehavior.quack();
	}

	public void performFly() {
		this.flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	
	
	
	
}
