package statePatternEj2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alarma alarma = new Alarma();
		Activa estado1 = new Activa();
		Mantenimiento estado2 = new Mantenimiento();
		int opcion = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			muestraMenu();
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				alarma.setEstado(estado1);
				break;

			case 2:
				alarma.setEstado(estado2);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Opcion no valida");
				muestraMenu();
				opcion = scanner.nextInt();
				
			}
			alarma.ejecutarEstadoDeAlarma();
		} while (opcion != 0);

	}

	private static void muestraMenu() {

		StringBuffer menu = new StringBuffer();
		menu.append("*****\n");
		menu.append("Seleccione el estado de la alarma*\n");
		menu.append("1- activa -- 2--mantemiento ---- 0 para salir*\n");
		System.out.println(menu.toString());

	}

}
