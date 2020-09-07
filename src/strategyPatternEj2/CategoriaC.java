package strategyPatternEj2;

public class CategoriaC extends Categoria {


	//Categoría C: Los empleados de categoría C recibirán un bono de $500.

	@Override
	public double calcularSueldoNeto(Empleado empleado) {
		// TODO Auto-generated method stub
		
		return empleado.getSueldoBrutoAnual()+500;
	}
	
	
}
