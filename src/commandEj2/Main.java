package commandEj2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creo un texto
		
		Texto texto1= new Texto();
		
		//creo un editor
		
		EditorButton editor= new EditorButton();
		
		// creo comandos
		
		ItalicaCommand ponerItalica= new ItalicaCommand(texto1);
		NegritaCommand ponerNegrita= new NegritaCommand(texto1);

		// le digo al editor que quiero ejecutar esos comandos
		
		editor.Ejecutar(ponerNegrita);
		editor.Ejecutar(ponerItalica);

		// ahora le digo al editor que quiero sacar un comando debiria sacar el último osea sacar la italica 
		
		editor.Desahacer();
		
		// si le vuelvo a decir deshacer debe sacar el negrita
		
		editor.Desahacer();

		//agrego un nuevo comando para ver si es escalable 
		
		TamañoCommand cambiarTamaño= new TamañoCommand(texto1);
		
		editor.Ejecutar(cambiarTamaño);
		
		
		
		
		
		
	}

}
