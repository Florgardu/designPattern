package commandEj2;

public class ItalicaCommand extends CommandAbstract {


	
	public ItalicaCommand(Texto texto) {
		super(texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Do() {
		// TODO Auto-generated method stub
		this.texto.Italica();
	}

	@Override
	public void Undo() {
		// TODO Auto-generated method stub
		this.texto.SacarItalica();
	}

	
	
	
}
