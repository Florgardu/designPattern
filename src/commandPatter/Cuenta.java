package commandPatter;

//Receiver/Request 
public class Cuenta {
	
	private int id;
	private double saldo;
	
	
	public Cuenta(int id, double saldo) {
		this.id = id;
		this.saldo = saldo;
	}
	
	public void retirar (double monto) {
		this.saldo= this.saldo-monto;
		System.out.println("Comando retirar, ahora el saldo actual es " + saldo);
		
	}
	
	public void depositar (double monto) {
		this.saldo= this.saldo+monto;
		System.out.println("Comando depositar ahora el saldo actual es " + saldo);
		
	}
	

}
