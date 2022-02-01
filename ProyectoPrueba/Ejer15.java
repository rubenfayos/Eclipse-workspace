package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número");
		
		int num = teclado.nextInt();
		
		tablas(num);

	}
	
	public static void tablas(int num) {
		
		for (int i = 1 ; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
		
	}

}
