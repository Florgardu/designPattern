package statePattern;

public class Triste implements State{
	
	private Tamagochi tamagochi;


	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("No tengo hambre");
	}

	@Override
	public void tomar() {
		// TODO Auto-generated method stub
		System.out.println("No tengo sed");

	}

	@Override
	public void mimar() {
		// TODO Auto-generated method stub
		System.out.println("Gracias, ahora estoy Feliz");
		this.tamagochi.setState(new Feliz());

	}

	@Override
	public void pegar() {
		// TODO Auto-generated method stub
		System.out.println("Ahora estoy MÁS triste :( ");

	}

	public void setTamagochi(Tamagochi tamagochi) {
		// TODO Auto-generated method stub
		this.tamagochi=tamagochi;

	}

	

	
	
	
	
}
