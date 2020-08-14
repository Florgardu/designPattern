package statePattern;

public class Feliz implements State{
	
	private Tamagochi tamagochi;

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Gracias pero no tengo hambre");
	}

	@Override
	public void tomar() {
		// TODO Auto-generated method stub
		System.out.println("Gracias pero no tengo sed");

	}

	@Override
	public void mimar() {
		// TODO Auto-generated method stub
		System.out.println("Gracias sigo estando MÁS feliz");

	}

	@Override
	public void pegar() {
		// TODO Auto-generated method stub
		System.out.println("Me pegaste, me pongo triste");
		tamagochi.setState(new Triste());

	}

	public void setTamagochi(Tamagochi tamagochi) {
		// TODO Auto-generated method stub
		this.tamagochi=tamagochi;
	}

	

}
