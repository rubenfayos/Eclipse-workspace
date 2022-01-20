package com.dam.ruben.ejer2;

import java.util.Scanner;

public class main {
	
	/*	(EJERCICIO 2) Escribe una clase Cuenta para representar una cuenta bancaria. Los datos
		de la cuenta son: nombre del cliente (String), número de cuenta (String), tipo de interés
		(double) y saldo (double).
		La clase contendrá los siguientes métodos:
		
			- Constructor por defecto
			
			- Constructor con todos los parámetros
			
			- Métodos setters/getters de todos los atributos.
			
			- Método ingreso: Un ingreso consiste en aumentar el saldo en la cantidad que se
		indique. Esa cantidad no puede ser negativa. Devuelve true si la operación se ha podido
		realizar o false en caso contrario.
		
			- Método reintegro: Un reintegro consiste en disminuir el saldo en una cantidad pero
		antes se debe comprobar que hay saldo suficiente. La cantidad no puede ser negativa.
		Devuelve true si la operación se ha podido realizar o false en caso contrario.
		
			- Método transferencia que permita pasar dinero de una cuenta a otra siempre que en
		la cuenta de origen haya dinero suficiente para poder hacerla.
	 * 
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num;
		int menu;
		
		cuenta c2 = new cuenta();
			c2.setNombre("Samuel");
			c2.setNumcuenta("2222");
			c2.setSaldo(2000);
			c2.setInteres(2);
		
		cuenta c1 = new cuenta();
		
		System.out.println("Vamos a crear una cuenta, primero introduce el nombre:");
		
		c1.setNombre(teclado.nextLine());
		
		System.out.println("Ahora el número de cuenta: ");
		
		c1.setNumcuenta(teclado.nextLine());
		
		System.out.println("Ahora los interes: ");
		
		c1.setInteres(teclado.nextDouble());
		
		System.out.println("Por último el saldo: ");
		
		c1.setSaldo(teclado.nextDouble());
		
		do {
		
		System.out.println("Introduce lo que quieras hacer: 1 Ver datos de la cuenta | 2 Ingreso | 3 Reintegro | 4 transferencia | 5 salir");
		
		menu = teclado.nextInt();
		
		if (menu == 1) {
			System.out.println("Que cuenta quieres ver: 1 | 2 ");
			menu = teclado.nextInt();
				if(menu == 1) {
			System.out.println("Los datos de su cuenta son: ");
			System.out.println("Nombre: " + c1.getNombre());
			System.out.println("Número de cuenta: " + c1.getNumcuenta());
			System.out.println("Intereses: " + c1.getInteres() + "%");
			System.out.println("Saldo " + c1.getSaldo() + "€");
				}else if(menu == 2) {
			System.out.println("Los datos de su cuenta son: ");
			System.out.println("Nombre: " + c2.getNombre());
			System.out.println("Número de cuenta: " + c2.getNumcuenta());
			System.out.println("Intereses: " + c2.getInteres() + "%");
			System.out.println("Saldo " + c2.getSaldo() + "€");	
				}
		}
			else if(menu == 2) {
				System.out.println("Su saldo actual es " + c1.getSaldo() + "€\nIntroduce la cantida que quiera ingresar.");
				num = teclado.nextDouble();
				c1.ingreso(num);
			}
			else if(menu == 3) {
				System.out.println("Su saldo actual es " + c1.getSaldo() + "€\nIntroduce la cantida que quiera retirar.");
				num = teclado.nextDouble();
				c1.reintegro(num);
			}else if(menu == 4) {
				
				System.out.println("Desde que cuenta quieres hacer la transferencia: 1 | 2");
				menu = teclado.nextInt();
					if(menu == 1) {

				System.out.println("Su saldo actual es " + c1.getSaldo() + "€\nIntroduce la cantida que quiera transferir");
					num = teclado.nextDouble();
				
					c1.transferencia1(num, c2);
					}
				
				else if(menu == 2) {
				System.out.println("Su saldo actual es " + c2.getSaldo() + "€\nIntroduce la cantida que quiera transferir");
					num = teclado.nextDouble();
				
					c2.transferencia2(num, c1);
					
				}
				
			}
				
				
			}while(menu <= 4);
				
			
			}
			
		}
		
		
		


