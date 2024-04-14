package ar.edu.unju.fi.punto4;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
        double factorial = 1;
        Scanner sc = new Scanner(System.in); 
        do { 
            System.out.print("Introduce un numero entero entre 0 y 10: ");
            num = sc.nextInt();
        } while (num <= 0 && num >=10); //aqui termina
        
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        //mostrar el resultado
        System.out.printf("%d! = %.0f %n", num, factorial);
        sc.close();
	}
}