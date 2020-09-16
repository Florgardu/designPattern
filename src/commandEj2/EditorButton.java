package commandEj2;

import java.util.Stack;

public class EditorButton {
	
	private Stack<CommandAbstract> _historial = new Stack<CommandAbstract>();

	private CommandAbstract command;
	
	

    public void Ejecutar(CommandAbstract command)
    {
    	_historial.push(command);
        command.Do();
    }
		
    
    public void Desahacer()
    {
    	CommandAbstract command = _historial.pop();
        command.Undo();
    }
	

}
