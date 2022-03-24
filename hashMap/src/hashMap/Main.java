package hashMap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Agenda a = new Agenda();
		
		int opcion = 0;
		
		do {
		
			System.out.println("1)Añadir contacto \n2)Modificar contacto \n3)Eliminar contacto \n4)Ver contacto \n5)Salir");
			
			opcion=teclado.nextInt();
			
			switch(opcion) {
				case 1: a.añadirContacto();
				break;
				
				case 2: a.modificarContacto();
				break;
				
				case 3: a.eliminarContacto();
				break;
				
				case 4: a.verTelefono();
				break;
				
				case 5: System.out.println("Saliendo del programa...");
				break;
				
				default: System.out.println("Opcion incorrecta, selecciona otra opción");
			}
		
		}while(opcion != 5);
		
	}
	

}
