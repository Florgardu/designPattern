package strategyPatternEj2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creo una categoria
		
		Categoria categoriaA = new CategoriaA();
        Categoria categoriaB = new CategoriaB();
		
		
		// creo un empleado
		
		Empleado empleado1= new Empleado(categoriaA, 5, "Florencia", 2, 5000);
		
		Empleado empleado2= new Empleado(categoriaB, 10, "Andres", 5, 1000);

		
		double resultado1 = empleado1.calcularSueldo();
		double resultado2= empleado2.calcularSueldo();
		
		System.out.println(resultado1);
		System.out.println(resultado2);

		
	}

}
