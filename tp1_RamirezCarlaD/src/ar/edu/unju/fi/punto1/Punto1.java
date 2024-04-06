package ar.edu.unju.fi.punto1;
import java.util.Scanner;

public class Punto1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a;
	int b;
	int c;
	int d;
	int e;
	float prom;
	
	Scanner leer = new Scanner(System.in);
	System.out.print("Ingrese el primer numero: ");
	a = leer.nextInt(); //esta linea lee lo que ingresa el usuario por consola
	System.out.print("Ingrese el segundo numero: ");
	b = leer.nextInt(); 
	System.out.print("Ingrese el tercer numero: ");
	c = leer.nextInt();
	System.out.print("Ingrese el cuarto numero: ");
	d = leer.nextInt();
	System.out.print("Ingrese el quinto numero: ");
	e = leer.nextInt();
	prom = (a + b + c + d + e);
	prom = (prom / 5);
	System.out.print("El promedio de los numeros ingresados es: " + prom);
	leer.close();
	}
}
