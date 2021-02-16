package mementoPattern;

public class Originator {
	
	
	private String nombre;
	private String apellido;
	private double estado;
	
	
	public Object sacarFoto() {
		 Memento m= new Memento(this.nombre, this.apellido, this.estado);
		 return m;
	}


	public void restaurar(Object memento) {
		// TODO Auto-generated method stub
		Memento objetoConvertido= (Memento)memento;
		this.nombre= objetoConvertido.getNombre();
		this.apellido= objetoConvertido.getApellido();
		this.estado= objetoConvertido.getEstado();
	}
	
	private class Memento {

		
		private String nombre;
		private String apellido;
		private double estado;
		
		
		public Memento(String nombre, String apellido, double estado) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.estado = estado;
		}


		public String getNombre() {
			return nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public double getEstado() {
			return estado;
		}
	
	
}
}
