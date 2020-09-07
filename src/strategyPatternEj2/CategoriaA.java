package strategyPatternEj2;

public class CategoriaA extends Categoria {

	//Categoría A: Los empleados que tengan esta categoría recibirán un bono equivalente al X% de su
			// sueldo bruto anual, siendo X el día de ingreso a la compañía (de 1 a 31).
			
		
	@Override
	public double calcularSueldoNeto(Empleado empleado) {
		// TODO Auto-generated method stub
		double porcentaje=(double)empleado.getDiaIngreso()/100;
		
		double sueldoBruto= empleado.getSueldoBrutoAnual();
		double bono=sueldoBruto*porcentaje;
		return sueldoBruto+bono;
	}

	
		
	
	
	
	
	
	
}
