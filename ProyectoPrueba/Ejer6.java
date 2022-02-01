package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int radio, altura, num = 0;
		
		do {
			
			System.out.println("Introduce el radio");
			
			radio = teclado.nextInt();
			
			System.out.println("Introduce la altura");
			
			altura = teclado.nextInt();
			
			System.out.println("Introduce la operación que quieres (1 Area | 2 Volumen)");
			
			int opcion = teclado.nextInt();
			
			System.out.println("El resultado es : " + calcular(radio, altura, opcion));
			
			System.out.println("Que quieres hacer (1 Repetir | 0 Terminar)");
			
			num = teclado.nextInt();
			
		}while(num != 0);

	}
	
	public static double calcular(int radio, int altura, int opcion) {
		
		double resultado = 0;
		
		if (opcion == 1) {
			resultado = 3.14 * (radio * 2) * altura;
		}else {
			resultado = (3.14 * 2 * radio * altura) + (3.14 * 2 * radio);
		}
		
		return resultado;
	}

}
