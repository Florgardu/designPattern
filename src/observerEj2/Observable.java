package observerEj2;

public interface Observable {
	
	//en este ejemplo seria el canal de yt

	void attach(Observer o);

	void detach(Observer o);

	void notificar();

}
