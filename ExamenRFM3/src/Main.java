import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

		DGTI DGTI = new DGTI();
		DGTI.usuarios();
		
		int eleccion = 0;
		
		
		System.out.println("Bienvenido al programa");
		
		do {
		
		System.out.println("Seleccion una opción; \n1)Listar usuarios por país \n2)Añadir puntos a una persona \n3)Quitar puntos a una persona \n4)Salir");
		
		
		
		eleccion = teclado.nextInt();
		
		switch(eleccion) {
		
		case 1: DGTI.listarUsuarios(DGTI.elegirPais());
		break;
		case 2: DGTI.añadirPuntos(DGTI.elegirPais());
		break;
		case 3: DGTI.restarPuntos(DGTI.elegirPais());
		break;
		
		}
		
		
		}while(eleccion != 4);

	}

}
