package commandPatter;

import java.util.ArrayList;

public class Invocador {

	private ArrayList<IOperacion>operaciones = new ArrayList<IOperacion>();
	
	
	public void recibirOperacion (IOperacion o) {
		this.operaciones.add(o);
	}
	
	public void realizarOperaciones() {
		
		for (IOperacion iOperacion : operaciones) {
			iOperacion.executar();
		}
		
		this.operaciones.clear();
	}
	
}
