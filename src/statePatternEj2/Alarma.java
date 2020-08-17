package statePatternEj2;

public class Alarma {


	private Estado miEstado; 
	
	public void setEstado(Estado e) {
		this.miEstado= e;
	}
	
	
	public void ejecutarEstadoDeAlarma() {
		miEstado.ejecutarAccion();
	}
}
