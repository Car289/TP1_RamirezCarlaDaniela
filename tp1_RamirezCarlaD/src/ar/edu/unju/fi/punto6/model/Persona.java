package ar.edu.unju.fi.punto6.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

	private long dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(long dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}

	public Persona(long dni, String nombre, LocalDate fechaDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = "Jujuy";
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	// Este m�todo retorna la edad de la persona.

	public int edadPersona() {
		LocalDate fechaDeHoy = LocalDate.now();
		Period periodo = Period.between(fechaDeNacimiento, fechaDeHoy);
		return periodo.getYears();
	}

	
	 // Este m�todo devuelve true si la edad es mayor a 18 a�os
	public boolean verificarEdad() {
		return edadPersona() > 18;
	}

	public void mostrarDatos() {
		int edad = edadPersona();
		boolean mayorDeEdad = verificarEdad();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaFormateada = fechaDeNacimiento.format(formatoFecha);
		System.out.println("----------------");
		System.out.println("DATOS DE PERSONA");
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaFormateada);
		System.out.println("Provincia: " + provincia);
		System.out.println("Edad: " + edad);

		if (mayorDeEdad == true) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona no es mayor de edad");
		}
	}
}
