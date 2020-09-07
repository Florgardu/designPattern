package strategyPatternEj2;

import java.util.ArrayList;

public class CategoriaB extends Categoria {

	//Categoría B: Los empleados de la categoría B recibirán un descuento de su sueldo si es que su
	//nombre empieza con una vocal, equivalente al X% de su sueldo bruto anual, siendo X la cantidad
	//de hijos que tienen
	
	
	@Override
	public double calcularSueldoNeto(Empleado empleado) {
		// TODO Auto-generated method stub
		double sueldoNeto=0;
		double sueldoBruto= empleado.getSueldoBrutoAnual();
		boolean nombreEmpiezaConVocal= empiezaConVocal(empleado.getNombre());
		
		if (nombreEmpiezaConVocal) {
			sueldoNeto= sueldoBruto-(sueldoBruto*((double)empleado.getCantidadHijos()/100));
		}
	
		return sueldoNeto;
		
		
	}
	
	public boolean empiezaConVocal(String nombre){
		boolean empiezaConVocal=false;
		char[] letras= nombre.toCharArray();
		char primerLetra= letras[0];
		if (primerLetra=='A' || primerLetra=='E' || primerLetra=='I' || primerLetra=='O' || primerLetra=='U' ) {
			empiezaConVocal=true;
		}
		return empiezaConVocal;
		
	}

}
