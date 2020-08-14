package strategyDuckSim;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Im flying like a rocket");
	}

}
