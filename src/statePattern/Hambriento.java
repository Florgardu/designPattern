package statePattern;

public class Hambriento implements State {

	private Tamagochi tamagochi;
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Gracias por darme de comer, ahora estoy feliz");
		tamagochi.setState(new Feliz());
	}

	@Override
	public void tomar() {
		// TODO Auto-generated method stub
		System.out.println("No tengo sed");

	}

	@Override
	public void mimar() {
		// TODO Auto-generated method stub
		System.out.println("No quiero mimos");

	}

	@Override
	public void pegar() {
		// TODO Auto-generated method stub
		System.out.println("Me pegaste, me pongo triste");
		this.tamagochi.setState(new Triste());
	}

	public void setTamagochi(Tamagochi tamagochi) {
		// TODO Auto-generated method stub
		this.tamagochi=tamagochi;

	}


	
	

}
