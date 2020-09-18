package observerPattern;

import java.util.ArrayList;

public class Maquina2 implements SujetoObservable {

	private ArrayList <Observador> misObservadores = new ArrayList<Observador>();
	
	//dispara el evento
	public void cambiar () {
		this.notificar();
	}
	

	
	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		for (Observador observador : misObservadores) {
			observador.update();
		}
	}

	@Override
	public void suscribirse(Observador observador) {
		// TODO Auto-generated method stub
		this.misObservadores.add(observador);
	}

	@Override
	public void Desuscribirse(Observador observador) {
		// TODO Auto-generated method stub
		this.misObservadores.remove(observador);
	}

}
