package observerPattern;

public interface SujetoObservable {
	
	public void notificar();	 // avisar a observadores 
	public void suscribirse(Observador observador);
	public void Desuscribirse(Observador observador);


}
