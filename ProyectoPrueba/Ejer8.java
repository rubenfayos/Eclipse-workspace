package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		
		int num = teclado.nextInt();
		
		System.out.println("El resultado es: " + calc(num));

	}
	public static int calc(int x) {
		
		int resultado = 0;
		
		while(x > 0) {
			if (x % 2 != 0) 
			resultado += x;
			x = x - 1;
		}
		
		
		return resultado;
		
	}

}
