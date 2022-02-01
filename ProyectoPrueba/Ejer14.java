package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer14 {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número");
		
		int num = teclado.nextInt();
		
		calc(num);
		
	}
	
	public static void calc(int num) {
		
		int y= 0, x = 1, num2, cont=0;
		
		while (x <= num){
			
			y++;
			x = x * 10;	
		}
		
		y--;
		
		while (num > 0) {
			
			x = (int) Math.pow(10, y);
			
			num2 = num / x;
			
			num = num - (num2 * x);
			y--;
			
			if (num2 == 0 || num2 % 2 == 0 ) {
				System.out.print( num2 + " ");
				cont+= num2;
			}
			
		}
		
		System.out.println("La suma de los pares es: " + cont);
		
	}

}
