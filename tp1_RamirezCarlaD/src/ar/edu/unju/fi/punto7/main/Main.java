package ar.edu.unju.fi.punto7.main;
//@author Carla
 import java.util.Scanner;
import ar.edu.unju.fi.punto7.model.Empleado;

	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String nombreEmpleado;
			int legajoEmpleado;
			double salarioEmpleado;

			Scanner sc = new Scanner(System.in);

			System.out.print("Ingrese Nombre del empleado: ");
			nombreEmpleado = sc.nextLine();
			System.out.print("Ingrese N° de legajo del empleado: ");
			legajoEmpleado = sc.nextInt();
			System.out.print("Ingrese salario del empleado: ");
			salarioEmpleado = sc.nextDouble();

			Empleado empleado = new Empleado(nombreEmpleado, legajoEmpleado, salarioEmpleado);

			empleado.setNombre(nombreEmpleado);
			empleado.setLegajo(legajoEmpleado);
			System.out.println("");
			System.out.println("DATOS DEL EMPLEADO");
			empleado.mostrarDatos();
			empleado.aumentoPorMerito();
			System.out.println("");
			System.out.println("DATOS DEL EMPLEADO CON AUMENTO POR MERITO");
			empleado.mostrarDatos();
			sc.close();
		}
}
