package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int num2 = 0;
		
		System.out.println("Introduce el primer n�mero");
		
		int num1 = teclado.nextInt();
		
		do {
		
		System.out.println("Introduce el segundo n�mero");
		
		num2 = teclado.nextInt();
		
		if(num1 >= num2) {
			System.out.println("El n�mero tiene que ser mayor al anterior");
		}
		
		}while(num1 >= num2);
		
		System.out.println("El resultado es: " + calc(num1, num2));

	}
	
	public static int calc(int x, int y) {
		
		int resultado = 0;
		
		while(x <= y) {
			resultado+=x;
			x++;
		}
		
		return resultado;	
	}

}
