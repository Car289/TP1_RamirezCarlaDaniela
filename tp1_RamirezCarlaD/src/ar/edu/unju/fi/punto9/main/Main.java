package ar.edu.unju.fi.punto9.main;
import java.util.Scanner;

import ar.edu.unju.fi.punto9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int codigoProducto;
		double precioProducto;
		String nombreProducto;

		byte descuentoProducto;
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
			System.out.print("Nombre: ");
			nombreProducto = sc.next();
			System.out.print("Código: ");
			codigoProducto = sc.nextInt();
			System.out.print("Precio: ");
			precioProducto = sc.nextDouble();
			do {
				System.out.print("Descuento (%): ");
				descuentoProducto = sc.nextByte();
			} while (descuentoProducto < 0 || descuentoProducto > 50);
			Producto producto = new Producto();

			producto.setNombre(nombreProducto);
			producto.setCodigo(codigoProducto);
			producto.setPrecio(precioProducto);
			producto.setDescuento(descuentoProducto);

			System.out.println();
			System.out.println("Informacion del Producto");
			producto.mostrarInformacionProducto();
			System.out.println();
		}
		sc.close();
	}

}
