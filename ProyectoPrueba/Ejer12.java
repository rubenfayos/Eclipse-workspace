package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un n�mero");
		
		int num = teclado.nextInt();
		
		System.out.println("El n�mero de d�gitos es: " + calc(num));

	}
	
	public static int calc(int x) {
		
		int y= 0, num = 1;
		
		while (num <= x){
			
			y++;
			num = num * 10;	
		}
		
		return y;
	}

}
