package observerPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Maquina maquina1 = new Maquina();
		Maquina2 maquina2 = new Maquina2();

		
		Doctor doctor1 = new Doctor();
		Doctor2 doctor2 = new Doctor2();

		
		
		// suscribo a un doctor a una sola maquina
		
		maquina1.suscribirse(doctor1);
		
		// y suscribo al doctor 2 a las dos maquina 
		
		maquina1.suscribirse(doctor2);
		maquina2.suscribirse(doctor2);

		
		// ahora disparo evento de maquina 1 - debe avisar a doctor 1 y doctor 2 
		
		maquina1.cambiar();
		
		// ahora disparo evento de maquina 2 - debe avisar solo a doctor 2 
		
		maquina2.cambiar();
		
		
	}

}
