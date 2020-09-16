package commandPatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuenta cuenta1 = new Cuenta(1, 5000);
		
		DepositarImpl depositar = new DepositarImpl(cuenta1, 100);
		
		RetirarImpl retirar = new RetirarImpl(cuenta1, 50);
		
		Invocador invoker= new Invocador();
		
		invoker.recibirOperacion(depositar);
		
		invoker.recibirOperacion(retirar);

		invoker.realizarOperaciones();
		
		
		
	}

}
