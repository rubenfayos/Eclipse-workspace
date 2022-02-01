package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce otro número");
		int num2 = teclado.nextInt();
		
		System.out.println(maximo(num1, num2));

	}
	
	public static int maximo(int a, int b ) {
		
		if (a>b) {
			return a;
		}else {
			return b;
		}
		
	}

}
