package ar.edu.unju.fi.punto6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	
	public Persona() { //Constructor por defecto (constructor vacio).
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Persona: dni=" + dni + 
				", nombre=" + nombre + 
				", fechaNac=" + fechaNac + 
				", provincia=" + provincia;
	}


	public Persona(String dni, String nombre, LocalDate fechaNac, String provincia) { //Constructor parametrizado.
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = provincia;
	}

	public Persona(String dni, String nombre, LocalDate fechaNac) { //Constructor parametrizado sin inicializar "provincia"
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = "Jujuy"; //Le asigno el valor JUJUY a provincia
	}

	//Creacion de Gett and Set
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public void datos() {
		System.out.println("DNI: " + this.dni);
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("FECHA DE NACIMIENTO: " + this.fechaNac);
		System.out.println("PROVINCIA: " + this.provincia);
	}
}
