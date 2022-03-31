import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Usuario u1 = new Usuario("Rubén", "Fayos", "2020-02-03", 18);

		Articulo[] listaArticulos = new Articulo[12];
		
		//Camisetas
		
		listaArticulos[0] = new Camiseta("Niño", 15, true, "M", "Azul");
		listaArticulos[1] = new Camiseta("Niña", 25, false, "S", "Blanco");
		listaArticulos[2] = new Camiseta("unisex", 10, true, "XL", "Negro");
		
		//Pantalones
		
		listaArticulos[3] = new Pantalon("Niña", 30, false, 36, 1);
		listaArticulos[4] = new Pantalon("Hombre", 45, false, 40, 2);
		listaArticulos[5] = new Pantalon("Mujer", 27, false, 42, 1);
		
		//Perfume
		
		listaArticulos[6] = new Perfume("unisex", 55, true, 100);
		listaArticulos[7] = new Perfume("unisex", 35, false, 150);
		listaArticulos[8] = new Perfume("Mujer", 105, true, 200);
		
		//Zapatos
		
		listaArticulos[9] = new Zapatos("Niño", 55, false, 35, "piel");
		listaArticulos[10] = new Zapatos("Hombre", 35, true, 42, "Cuero");
		listaArticulos[11] = new Zapatos("Mujer", 15, false, 41, "plastico");
		
		//Programa
		
		int menu = 0;

		do {
			
			System.out.println("Indique la función que quiera realizar: \n1)Listar carrito \n2)Añadir Productos a la cesta"
					+"\n3)Eliminar productos de la cesta \n4)Mostrar datos usuario \n5)Modificar datos usuario \n6)Listar productos"
					+ "\n7)Listar por categoría \n8)Listar productos con oferta \n9)Listar por categoría");
			
			menu=teclado.nextInt();
		
		switch(menu) {
		case 1:
		break;
		
		case 2:
		break;
		
		case 3:
		break;
		
		case 4: mostrarDatosUsuario(u1);
		break;
		
		case 5: editarDatosUsuario(u1, menu);
		break;
		
		case 6: listarProductos(listaArticulos);
		break;
		
		case 7:
		break;
		
		case 8:
		break;
		
		case 9:
		break;	
		
		}
		
		menu=teclado.nextInt();
		
		}while(menu < 9);
		
				
		
	}
	
	public static void mostrarDatosUsuario(Usuario u1) {
		
		System.out.println("Datos de usuario:");
		System.out.println("Nombre: " + u1.getNombre());
		System.out.println("Apellidos: " + u1.getApellidos());
		System.out.println("Fecha registro: " + u1.getFechaRegistro());
		System.out.println("Edad: " + u1.getEdad());
		
	}
	
	public static void editarDatosUsuario(Usuario u1, int menu) {
		Scanner teclado = new Scanner(System.in);

		do {
			
			System.out.println("¿Que dato quieres modificar? "
					+ "\n1)Nombre \n2)Apellidos \n3)Edad \n4)Salir");
			
			menu = teclado.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("Introduce el nuevo nombre");
			teclado.nextLine();
			u1.setNombre(teclado.nextLine());
		break;
		
		case 2:
			System.out.println("Introduce el nuevo apellido");
			teclado.nextLine();
			u1.setApellidos(teclado.nextLine());
		break;
		
		case 3:
			System.out.println("Introduce tú edad");
			teclado.nextLine();
			u1.setEdad(teclado.nextInt());
		break;		
		}
		
		}while(menu<4);
		
	}
	
	public static void listarProductos(Articulo[] lista) {
		
		for(int i = 0; i<lista.length; i++) {
			
		}
		
	}
			
}
