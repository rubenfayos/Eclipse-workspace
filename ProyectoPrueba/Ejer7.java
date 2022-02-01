package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		
		int num = teclado.nextInt();
		
		calc(num);
		
	}
	
	public static void calc(int num) {
		
		if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
			System.out.print("No es un número primo");
		}else {
			System.out.print("Es un número primo");
		}
		
	}

}
