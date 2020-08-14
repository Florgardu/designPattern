package strategyDuckSim;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Duck mallard= new MallardQuack();
		
		mallard.performQuack();
		mallard.performFly();
		
		
		Duck model= new ModelDuck();
		
		model.performFly();
		
		model.setFlyBehavior( new FlyRocketPowered());

		model.performFly();

		
}
	
	
}
