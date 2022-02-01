package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce otro número");
		int num2 = teclado.nextInt();
		
		System.out.println(producto(num1, num2));

	}
	
	public static int producto (int a, int b) {
		
		int c = a * b;
		
		return c;
	}

}
