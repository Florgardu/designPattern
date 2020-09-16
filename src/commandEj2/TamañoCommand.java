package commandEj2;

public class TamañoCommand extends CommandAbstract {

	
	public TamañoCommand(Texto texto) {
		super(texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Do() {
		// TODO Auto-generated method stub
		this.texto.agrandarTamaño();
	}

	@Override
	public void Undo() {
		// TODO Auto-generated method stub
		this.texto.sacarAgrandarTamaño();
	}
	
	
	
	

}
