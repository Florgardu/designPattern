package factoryMethod;

public class Maquina {
	
	private Molde moldeParaHacerJuguetes;
	
	public Juguete fabricar() {
		return this.moldeParaHacerJuguetes.crear();
	}

	public void agregarMolde(Molde molde) {
		this.moldeParaHacerJuguetes=molde;
	}
	
	public void cambiarMolde(Molde moldeNuevo) {
		this.moldeParaHacerJuguetes=moldeNuevo;
	}
	
	
	
}
