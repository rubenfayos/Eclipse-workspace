package com.dam.ruben.tema4;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre = teclado.nextLine();
		
		holanombre(nombre);

	}
	
	public static void holanombre(String nombre) {
		
		System.out.print("Hola " + nombre);
		
	}

}
