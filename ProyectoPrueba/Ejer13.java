package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número");
		
		int num = teclado.nextInt();
		
		System.out.println("El número invertido es: " + invertido(num));

	}
	
	public static int invertido(int num) {
		
		int resto = 0;
		
		int invertido = 0;
		
		while(num > 0){
		
			resto = num % 10;
			
			invertido = (invertido * 10) + resto;
			
			num /= 10;
			
		}
		
		
		return invertido;
	}

}
