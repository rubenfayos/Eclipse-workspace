package principal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String salto = "";
		int menu = 0;
		dni dni1 = new dni();

do {
			
			System.out.println("elige una de las siguientes opcciones: \n1)Asignar letra al DNI \n2)Calcular letra DNI \n3)Convertir DNI completo \n4)Salir");
			
			menu = teclado.nextInt();
		
		switch (menu) {
			case 0:
		break;
			case 1:
				System.out.println("Introduce su DNI: ");
				dni1.setDni(teclado.nextInt());
				System.out.println("Su DNI es: " + dni1.getDni() + dni1.leer());
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
			case 2:
				System.out.println("Introduce su DNI: ");
				dni1.setDni(teclado.nextInt());
				System.out.println("La letra de su dni es: " + dni1.leer());
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
				
		break;
			case 3:
				System.out.println("Introduce su DNI: ");
				dni1.setDni(teclado.nextInt());
				System.out.println("Su DNI es: " + dni1.toString(dni1.getDni(), dni1.leer()));
				System.out.println("Pulsa para continuar...");
				teclado.nextLine();
				salto = teclado.nextLine();
		break;
			case 4:
		break;
		default: System.out.println("Opción incorrecta");
		System.out.println("Pulsa para continuar...");
		teclado.nextLine();
		salto = teclado.nextLine();
		}
		
		}while(menu <= 3 && menu >= 1);
	}

}
