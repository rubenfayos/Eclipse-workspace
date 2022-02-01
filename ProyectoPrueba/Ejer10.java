package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la base");
		
		int base = teclado.nextInt();
		
		System.out.println("Introduce la altura");
		
		int altura = teclado.nextInt();
		
		calc(base, altura);

	}
	
	public static void calc(int base, int altura) {
		
		int x = base;
		
		while (altura > 0) {
			base = x;
			while (base>0) {
				System.out.print("*");
				base--;
			}
			System.out.println();
			altura--;
		}
	
	}

}
