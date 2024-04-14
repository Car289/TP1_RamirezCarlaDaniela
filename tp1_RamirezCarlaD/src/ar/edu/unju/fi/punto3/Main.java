package ar.edu.unju.fi.punto3;

import java.util.Scanner;

public class Main {
	int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese un número entero: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			 num = num * 3;
			System.out.println(num);
		}
		else {
			num = num * 2;
			System.out.println(num);
		}
		sc.close();
	}

}
