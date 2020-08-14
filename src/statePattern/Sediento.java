package statePattern;

public class Sediento implements State {

	private Tamagochi tamagochi;

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("No tengo hambre");
	}

	@Override
	public void tomar() {
		// TODO Auto-generated method stub
		System.out.println("Gracias!! Ahora estoy feliz");
		this.tamagochi.setState(new Feliz());
	}

	@Override
	public void mimar() {
		// TODO Auto-generated method stub
		System.out.println("No quiero mimos, tengo sed");

	}

	@Override
	public void pegar() {
		// TODO Auto-generated method stub
		System.out.println("Me pegaste, ahora estoy triste");
		this.tamagochi.setState(new Triste());
	}

	public void setTamagochi(Tamagochi tamagochi) {
		// TODO Auto-generated method stub
		this.tamagochi=tamagochi;

	}

	
}
