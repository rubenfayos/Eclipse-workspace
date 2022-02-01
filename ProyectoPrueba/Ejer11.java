package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la altura");
		
		int altura = teclado.nextInt();
		
		calc(altura);

	}
	
	public static void calc(int a) {
		
		int b = 1;
		int c = 0;
		
		while(a > 0) {
			
			for ( c = b; c > 0; c--) {
				System.out.print("*");
			}
			
			System.out.println();
			
			b++;
			a--;
		}
		
		

	}

}
