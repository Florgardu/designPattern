package commandEj2;

public abstract class CommandAbstract {

	protected Texto texto;

	
	public CommandAbstract(Texto texto) {
		this.texto = texto;
	}
	
	
	public abstract void Do();
	public abstract void Undo();

	
}
