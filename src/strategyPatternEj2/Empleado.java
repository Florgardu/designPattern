package strategyPatternEj2;

public class Empleado {
	
	private Categoria categoria; 
	
	private int diaIngreso;
	
	private String nombre;
	
	private int cantidadHijos;
	
	private double sueldoBrutoAnual;
	
	
	
	public Empleado(Categoria categoria, int diaIngreso, String nombre, int cantidadHijos, double sueldoBrutoAnual) {
		this.categoria = categoria;
		this.diaIngreso = diaIngreso;
		this.nombre = nombre;
		this.cantidadHijos = cantidadHijos;
		this.sueldoBrutoAnual = sueldoBrutoAnual;
	}

	public double calcularSueldo() {
		double sueldoAnual= categoria.calcularSueldoNeto(this);
		return sueldoAnual;
	}

	
	public void cambiarCategoria( Categoria categoriaNueva) {
		this.categoria=categoriaNueva;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public int getDiaIngreso() {
		return diaIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public double getSueldoBrutoAnual() {
		return sueldoBrutoAnual;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setDiaIngreso(int diaIngreso) {
		this.diaIngreso = diaIngreso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public void setSueldoBrutoAnual(double sueldoBrutoAnual) {
		this.sueldoBrutoAnual = sueldoBrutoAnual;
	}
	
	
	
	
	
}
