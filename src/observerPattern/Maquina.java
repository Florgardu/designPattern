package observerPattern;

import java.util.ArrayList;

public class Maquina implements SujetoObservable {

	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	
	
	//dispara el evento
	public void cambiar () {
		this.notificar();
	}
	
	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		for (Observador observador : observadores) {
			observador.update();
		}
		
	}

	@Override
	public void suscribirse(Observador observador) {
		// TODO Auto-generated method stub
		this.observadores.add(observador);
	}

	@Override
	public void Desuscribirse(Observador observador) {
		// TODO Auto-generated method stub
		this.observadores.remove(observador);
	}

	
	
}
