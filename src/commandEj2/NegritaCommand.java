package commandEj2;

public class NegritaCommand extends CommandAbstract {
	
	
	public NegritaCommand(Texto texto) {
		super(texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Do() {
		// TODO Auto-generated method stub
		this.texto.Negrita();
	}

	@Override
	public void Undo() {
		// TODO Auto-generated method stub
		this.texto.SacarNegrita();
	}

	
	
	
}
