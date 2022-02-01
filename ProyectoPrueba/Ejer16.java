package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num=0;
		
		do {

		System.out.println("Introduce un número positivo");
		
		num = teclado.nextInt();
		
		}while(num <= 0);
		
		calc(num);
		
	}
	
	public static void calc(int num) {
		
		for (int i = 1; i <= num ; i++) {
			for (int a = num; a > 0 ; a--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}

