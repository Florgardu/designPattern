package mementoPattern;

import java.util.Stack;

public class Caretaker {
	
	
	private Originator originator;
	
	private Stack<Object> historial= new Stack<Object>();
	
	
	public void guardar() {
		this.historial.push(this.originator.sacarFoto());
	}

	
	public void restaurar() {
		 this.originator.restaurar(this.historial.pop());
	}

}
