package principal;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int menu = 0, cantidad;
		String salto = "";
		Scanner teclado = new Scanner(System.in);
		cafetera c1 = new cafetera();

		do {
			System.out.println("Que quieres hacer:\n"
					+ "1. Ver datos de la cafetera\n2. Llenar cafetera\n3. Servir taza\n4. Vaciar cafetera\n5 Agregar café");
				menu = teclado.nextInt();
				teclado.nextLine();
				
			if(menu == 1) {
				System.out.println("Capacidad de la cafetera: " + c1.getcapacidadMaxima() + "\nCantidad actual: " + c1.getcapacidadActual());
				System.out.println("Pulsa para continuar...");
				salto = teclado.nextLine();
				
			}else if(menu == 2) {
				c1.llenarCafetera();
				System.out.println("Pulsa para continuar...");
				salto = teclado.nextLine();
				
			}else if(menu == 3) {
				System.out.println("Que cantidad de café quieres servir, actualmente tienes " + c1.getcapacidadActual());
				cantidad = teclado.nextInt();
				teclado.nextLine();
				c1.servirTaza(cantidad);
				System.out.println("Pulsa para continuar...");			
				salto = teclado.nextLine();
				
			}else if(menu == 4) {
				c1.vaciarCafetera();
				System.out.println("Pulsa para continuar...");
				salto = teclado.nextLine();
				
			}else if(menu == 5) {
				System.out.println("Que cantidad de café quieres añadir, actualmente tienes " + c1.getcapacidadActual());
				cantidad = teclado.nextInt();
				teclado.nextLine();
				c1.ponerCafe(cantidad);
				System.out.println("Pulsa para continuar...");
				salto = teclado.nextLine();
			}
			
		}while(menu <6);

	}

}
