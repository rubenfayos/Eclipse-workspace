package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num1 = teclado.nextInt();
		
		System.out.println("Introduce otro número");
		int num2 = teclado.nextInt();
		
		System.out.println("Introduce la operacion a realizar (1 Suma | 2 Resta | 3 Multiplicación | 4 División)");
		int num3;
		do {
		num3 = teclado.nextInt();
		if(num3 < 1 || num3 > 4) {
			System.out.println("Opcion incorrecta (1 Suma | 2 Resta | 3 Multiplicación | 4 División)");
		}
		}while (num3 < 1 || num3 > 4);
		
		System.out.println(operacion(num1, num2, num3));

	}
	
	public static int operacion(int num1, int num2, int num3) {
		
		if(num3 == 1) {
			num3 = num1 + num2;
		}else if(num3 == 2) {
			num3 = num1 - num2;
		}else if(num3 == 3) {
			num3 = num1 * num2;
		}else if(num3 == 4) {
			num3 = num1 / num2;
		}
		
		return num3;
	}

}
