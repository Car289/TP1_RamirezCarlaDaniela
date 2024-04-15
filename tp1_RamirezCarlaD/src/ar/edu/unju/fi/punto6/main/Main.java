package ar.edu.unju.fi.punto6.main;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import ar.edu.unju.fi.punto6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Persona persona = new Persona();
		//procesamiento de pedidos
		System.out.println("Ingrese el DNI: ");
		String dni = sc.nextLine();
		System.out.println("Ingrese el Nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese la Fecha de Nacimiento: ");
		String fechaNacString = sc.nextLine();
		System.out.println("Ingrese la provincia: ");
		String provincia = sc.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(fechaNacString);
		LocalDate fechaNac = LocalDate.parse(fechaNacString,formatter);
		System.out.println(formatter.format(fechaNac));
		sc.close();
		
	}

}
