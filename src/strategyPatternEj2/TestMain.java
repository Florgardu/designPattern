package strategyPatternEj2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	void test() {

		//creo una categoria
		
		Categoria categoriaA = new CategoriaA();
	    Categoria categoriaB = new CategoriaB();
		
		
		// creo un empleado
		
		Empleado empleado1= new Empleado(categoriaA, 5	, "Florencia", 2, 5000);
		
		Empleado empleado2= new Empleado(categoriaB, 10, "Andres", 5, 1000);

		
		double resultado1 = empleado1.calcularSueldo();	
		double resultado2= empleado2.calcularSueldo();
		
		 assertEquals(5250, resultado1);
		 assertEquals(950, resultado2);

		
		
	}
	
	


}
