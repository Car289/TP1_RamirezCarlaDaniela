package ar.edu.unju.fi.punto10.model;

public class Pizza {
	private int diametro;
	private int precio;
	private double area;
	private boolean ingredienteEspecial;
	private int INGREDIENTE_ESPECIAL_20 = 500;
	private int INGREDIENTE_ESPECIAL_30 = 750;
	private int INGREDIENTE_ESPECIAL_40 = 1000;

	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredienteEspecial() {
		return ingredienteEspecial;
	}

	public void setIngredienteEspecial(boolean ingredienteEspecial) {
		this.ingredienteEspecial = ingredienteEspecial;
	}

	public int calcularPrecio() {
		if (diametro == 20) {
			if (ingredienteEspecial == true) {
				this.precio = 4500 + INGREDIENTE_ESPECIAL_20;
			} else {
				this.precio = 4500;
			}
		}
		
		if (diametro == 30) {
			if (ingredienteEspecial == true) {
				this.precio = 4800 + INGREDIENTE_ESPECIAL_30;
			} else {
				this.precio = 4800;
			}
		}
		
		if (diametro == 40) {
			if (ingredienteEspecial == true) {
				this.precio = 5500 + INGREDIENTE_ESPECIAL_40;
			} else {
				this.precio = 5500;
			}
		}
		return precio;
	}

	public double calcularArea() {
		double PI = 3.14159;
		area = PI * Math.pow(diametro, 2);
		return this.area;
	}

	public void mostrarPizza() {
		System.out.println("El diametro de la pizza es = " + diametro);
		System.out.println("Ingredientes especiales= " + ingredienteEspecial);
		System.out.println("El precio Pizza es = " + calcularPrecio() + "$");
		System.out.println("�rea de la pizza= " + calcularArea());
	}
}
