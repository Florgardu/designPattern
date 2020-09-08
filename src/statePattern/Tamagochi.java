package statePattern;

public class Tamagochi {
	
	private State estado;
	

	public Tamagochi() {
		setEstado(new Hambriento());
	}
	
	
	public State getEstado() {
		return estado;
	}


	public void setEstado(State estado) {
		this.estado = estado;
		this.estado.setTamagochi(this);
	}


	public void setState(State estado) {
		this.estado=estado;
	}
	
	
	public void alimentar() {
		estado.comer();
	}

	
	public void tomarAgua() {
		estado.tomar();
	}
	
	public void recibirMimos() {
		estado.mimar();
	}
	
	public void recibirGolpe() {
		estado.pegar();
	}
	
}
