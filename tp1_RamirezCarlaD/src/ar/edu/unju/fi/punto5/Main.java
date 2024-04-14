package ar.edu.unju.fi.punto5;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un numero entero entre 1 y 9: ");
        num = sc.nextInt();
		if (num >= 1 && num <= 9)
		{
			System.out.println("Tabla del " + num);
	        for(i = 0; i<=10; i++){
	             System.out.println(num + " x " + i + " = " + num*i);  
			}
		}
		sc.close();	
	}
}